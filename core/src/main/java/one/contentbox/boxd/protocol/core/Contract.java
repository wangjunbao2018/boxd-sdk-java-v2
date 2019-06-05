package one.contentbox.boxd.protocol.core;

import one.contentbox.boxd.abi.FunctionEncoder;
import one.contentbox.boxd.abi.FunctionReturnDecoder;
import one.contentbox.boxd.abi.datatypes.Address;
import one.contentbox.boxd.abi.datatypes.Function;
import one.contentbox.boxd.abi.datatypes.Type;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.request.Call;
import one.contentbox.boxd.protocol.core.request.ContractTx;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedContractTx;
import one.contentbox.boxd.protocol.exceptions.BoxdException;
import one.contentbox.boxd.protocol.exceptions.ContractCallException;
import one.contentbox.boxd.protocol.exceptions.TransactionException;
import one.contentbox.boxd.protocol.core.gas.ContractGasProvider;
import one.contentbox.boxd.protocol.core.gas.StaticGasProvider;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.util.*;


/**
 * Solidity contract type abstraction for interacting with smart contracts via native Java types.
 */
@SuppressWarnings("WeakerAccess")
public abstract class Contract {

    //https://www.reddit.com/r/ethereum/comments/5g8ia6/attention_miners_we_recommend_raising_gas_limit/
    /**
     * @deprecated ...
     */
    public static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);

    public static final String BIN_NOT_PROVIDED = "Bin file was not provided";
    public static final String FUNC_DEPLOY = "deploy";

    protected String contractBinary;
    protected String contractAddress;
    protected ContractGasProvider gasProvider;
    protected TransactionReceipt transactionReceipt;

    protected BigInteger gasLimit = new BigInteger("500000");
    protected BigInteger gasPrice = new BigInteger("20");

    protected  String address;
    protected String privateKey;
    private BoxdClient boxdClient;

    protected Contract(String contractBinary, String contractAddress,
                       BoxdClient boxdClient, String address, String privateKey,
                       ContractGasProvider gasProvider) {
        this.contractAddress = contractAddress;

        this.contractBinary = contractBinary;
        this.gasProvider = gasProvider;

        this.boxdClient = boxdClient;
        this.address = address;
        this.privateKey = privateKey;

        if(gasProvider != null) {
            this.gasLimit = gasProvider.getGasLimit();
            this.gasPrice = gasProvider.getGasPrice();
        }
    }

    protected Contract(String contractBinary, String contractAddress,
                       BoxdClient boxdClient, String address, String privateKey,
                       BigInteger gasPrice, BigInteger gasLimit) {
        this(contractBinary, contractAddress, boxdClient, address, privateKey,
                new StaticGasProvider(gasPrice, gasLimit));
    }


    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setTransactionReceipt(TransactionReceipt transactionReceipt) {
        this.transactionReceipt = transactionReceipt;
    }

    public String getContractBinary() {
        return contractBinary;
    }

    public void setGasProvider(ContractGasProvider gasProvider) {
        this.gasProvider = gasProvider;
    }

    /**
     * Allow {@code gasPrice} to be set.
     * @param newPrice gas price to use for subsequent transactions
     * @deprecated use ContractGasProvider
     */
    public void setGasPrice(BigInteger newPrice) {
        this.gasProvider = new StaticGasProvider(newPrice, gasProvider.getGasLimit());
    }

    /**
     * Get the current {@code gasPrice} value this contract uses when executing transactions.
     * @return the gas price set on this contract
     * @deprecated use ContractGasProvider
     */
    public BigInteger getGasPrice() {
        return gasProvider.getGasPrice();
    }


    /**
     * If this Contract instance was created at deployment, the TransactionReceipt associated
     * with the initial creation will be provided, e.g. via a <em>deploy</em> method. This will
     * not persist for Contracts instances constructed via a <em>load</em> method.
     *
     * @return the TransactionReceipt generated at contract deployment
     */
    public Optional<TransactionReceipt> getTransactionReceipt() {
        return Optional.ofNullable(transactionReceipt);
    }


    /**
     * Execute constant function call - i.e. a call that does not change state of the contract
     *
     * @param function to call
     * @return {@link List} of values returned by function call
     */
    private List<Type> executeCall(
            Function function) throws IOException, BoxdException {
        // call `docall` rpc api
        Call call = new Call();
        call.setContractAddr(contractAddress);
        call.setTimeout(0);
        call.setSender(address);
        call.setHeight(0);
        call.setData(FunctionEncoder.encode(function));
        String resp = boxdClient.call(call);
        return FunctionReturnDecoder.decode(resp, function.getOutputParameters());
    }


    protected RemoteCall<TransactionReceipt> executeRemoteCallTransaction(Function function) {
        return new RemoteCall<>(() -> executeTransaction(function));
    }

    protected TransactionReceipt executeTransaction(
            Function function)
            throws IOException, TransactionException, BoxdException {
        return executeTransaction(function, BigInteger.ZERO);
    }

    private TransactionReceipt executeTransaction(
            Function function, BigInteger weiValue)
            throws IOException, TransactionException, BoxdException {
        return executeTransaction(FunctionEncoder.encode(function), weiValue, function.getName());
    }

    TransactionReceipt executeTransaction(
            String data, BigInteger weiValue, String funcName)
            throws TransactionException, IOException, BoxdException {

        // make transaction
        ContractTx contractTx = new ContractTx();
        contractTx.setSender(address);
        contractTx.setAmount(0);
        contractTx.setData(data);

        contractTx.setDeployed(true);
        contractTx.setGasLimit(gasLimit);
        contractTx.setGasPrice(gasPrice);
        contractTx.setNonce(boxdClient.getNonce(address) + 1);
        UnsignedContractTx unsignedContractTx = boxdClient.makeUnsignedContractTx(contractTx);
        System.out.println(unsignedContractTx.getContractAddr());

        // sign transaction
        Transaction transaction = boxdClient.signTransaction(unsignedContractTx, "");

        // send transaction
        String hash = boxdClient.sendTransaction(transaction);

        // return transaction receipt
        TransactionReceipt receipt = new TransactionReceipt();
        receipt.setContractAddress(unsignedContractTx.getContractAddr());
        receipt.setTransactionHash(hash);
        return receipt;
    }

    protected <T> RemoteCall<T> executeRemoteCallSingleValueReturn(
            Function function, Class<T> returnType) {
        return new RemoteCall<>(() -> executeCallSingleValueReturn(function, returnType));
    }

    @SuppressWarnings("unchecked")
    protected <T extends Type> T executeCallSingleValueReturn(
            Function function) throws IOException, BoxdException {
        List<Type> values = executeCall(function);
        if (!values.isEmpty()) {
            return (T) values.get(0);
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    protected <T extends Type, R> R executeCallSingleValueReturn(
            Function function, Class<R> returnType) throws IOException, BoxdException {
        T result = executeCallSingleValueReturn(function);
        if (result == null) {
            throw new ContractCallException("Empty value (0x) returned from contract");
        }

        Object value = result.getValue();
        if (returnType.isAssignableFrom(value.getClass())) {
            return (R) value;
        } else if (result.getClass().equals(Address.class) && returnType.equals(String.class)) {
            return (R) result.toString();  // cast isn't necessary
        } else {
            throw new ContractCallException(
                    "Unable to convert response: " + value
                            + " to expected type: " + returnType.getSimpleName());
        }
    }

    @SuppressWarnings("unchecked")
    protected static <S extends Type, T> 
            List<T> convertToNative(List<S> arr) {
        List<T> out = new ArrayList<T>();
        for (Iterator<S> it = arr.iterator(); it.hasNext(); ) {
            out.add((T)it.next().getValue());
        }
        return out;
    }

    public static <T extends Contract> RemoteCall<T> deployRemoteCall(
            Class<T> type,
            BoxdClient boxdClient, String privateKey, String address,
            ContractGasProvider contractGasProvider,
            String binary, String encodedConstructor) {
        return new RemoteCall<>(() -> deploy(
                type, boxdClient, address, privateKey, contractGasProvider, binary,
                encodedConstructor, BigInteger.ZERO));
    }

    public static <T extends Contract> RemoteCall<T> deployRemoteCall(
            Class<T> type,
            BoxdClient boxdClient, String privateKey, String address,
            BigInteger gasPrice, BigInteger gasLimit,
            String binary, String encodedConstructor) {
        return deployRemoteCall(
                type, boxdClient, address, privateKey, gasPrice, gasLimit,
                binary, encodedConstructor, BigInteger.ZERO);
    }

    public static <T extends Contract> RemoteCall<T> deployRemoteCall(
            Class<T> type,
            BoxdClient boxdClient, String address, String privateKey,
            BigInteger gasPrice, BigInteger gasLimit,
            String binary, String encodedConstructor, BigInteger value) {
        return new RemoteCall<>(() -> deploy(
                type, boxdClient, address, privateKey, gasPrice, gasLimit, binary,
                encodedConstructor, value));
    }

    @Deprecated
    protected static <T extends Contract> T deploy(
            Class<T> type,
            BoxdClient boxdClient,String address,  String privateKey,
            BigInteger gasPrice, BigInteger gasLimit,
            String binary, String encodedConstructor, BigInteger value)
            throws RuntimeException, TransactionException {

        return deploy(type, boxdClient, address, privateKey,
                new StaticGasProvider(gasPrice, gasLimit),
                binary, encodedConstructor, value);
    }

    protected static <T extends Contract> T deploy(
            Class<T> type,
            BoxdClient boxdClient, String address, String privateKey,
            ContractGasProvider contractGasProvider,
            String binary, String encodedConstructor, BigInteger value)
            throws RuntimeException, TransactionException {

        try {
            Constructor<T> constructor = type.getDeclaredConstructor(
                    String.class,
                    BoxdClient.class, String.class, String.class,
                    ContractGasProvider.class);
            constructor.setAccessible(true);

            // we want to use null here to ensure that "to" parameter on message is not populated
            T contract = constructor.newInstance(null, boxdClient, address,  privateKey, contractGasProvider);

            return create(contract, binary, encodedConstructor, value);
        } catch (TransactionException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static <T extends Contract> T create(
            T contract, String binary, String encodedConstructor, BigInteger value)
            throws IOException, TransactionException, BoxdException {
        TransactionReceipt transactionReceipt =
                contract.executeTransaction(binary + encodedConstructor, value, FUNC_DEPLOY);

        String contractAddress = transactionReceipt.getContractAddress();
        if (contractAddress == null) {
            throw new RuntimeException("Empty contract address returned");
        }
        contract.setContractAddress(contractAddress);
        contract.setTransactionReceipt(transactionReceipt);

        return contract;
    }
}
