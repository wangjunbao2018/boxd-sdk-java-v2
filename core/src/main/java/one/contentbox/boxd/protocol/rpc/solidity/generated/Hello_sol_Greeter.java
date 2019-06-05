package one.contentbox.boxd.protocol.rpc.solidity.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import one.contentbox.boxd.abi.TypeReference;
import one.contentbox.boxd.abi.datatypes.DynamicArray;
import one.contentbox.boxd.abi.datatypes.Function;
import one.contentbox.boxd.abi.datatypes.Type;
import one.contentbox.boxd.abi.datatypes.Utf8String;
import one.contentbox.boxd.abi.datatypes.generated.Bytes31;
import one.contentbox.boxd.abi.datatypes.generated.StaticArray2;
import one.contentbox.boxd.abi.datatypes.generated.Uint256;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.Contract;
import one.contentbox.boxd.protocol.core.RemoteCall;
import one.contentbox.boxd.protocol.core.TransactionReceipt;
import one.contentbox.boxd.protocol.core.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the one.contentbox.boxd.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version none.
 */
public class Hello_sol_Greeter extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506106a0806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c8063c87cfe631161005b578063c87cfe63146101e8578063cfae3217146102f5578063ef690cc014610378578063f0ba8440146103fb5761007d565b80630178fe3f1461008257806329e99f0714610105578063624c605614610147575b600080fd5b6100ae6004803603602081101561009857600080fd5b810190808035906020019092919050505061043d565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156100f15780820151818401526020810190506100d6565b505050509050019250505060405180910390f35b6101316004803603602081101561011b57600080fd5b81019080803590602001909291905050506104c3565b6040518082815260200191505060405180910390f35b6101aa6004803603604081101561015d57600080fd5b8101908080604001906002806020026040519081016040528092919082600260200280828437600081840152601f19601f82011690508083019250505050505091929192905050506104ce565b6040518082600260200280838360005b838110156101d55780820151818401526020810190506101ba565b5050505090500191505060405180910390f35b61029e600480360360208110156101fe57600080fd5b810190808035906020019064010000000081111561021b57600080fd5b82018360208201111561022d57600080fd5b8035906020019184602083028401116401000000008311171561024f57600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f8201169050808301925050505050505091929192905050506104de565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156102e15780820151818401526020810190506102c6565b505050509050019250505060405180910390f35b6102fd6104e8565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561033d578082015181840152602081019050610322565b50505050905090810190601f16801561036a5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61038061058a565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103c05780820151818401526020810190506103a5565b50505050905090810190601f1680156103ed5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6104276004803603602081101561041157600080fd5b8101908080359060200190929190505050610628565b6040518082815260200191505060405180910390f35b6060600182908060018154018082558091505090600182039060005260206000200160009091929091909150555060018054806020026020016040519081016040528092919081815260200182805480156104b757602002820191906000526020600020905b8154815260200190600101908083116104a3575b50505050509050919050565b600060649050919050565b6104d6610649565b819050919050565b6060819050919050565b606060008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105805780601f1061055557610100808354040283529160200191610580565b820191906000526020600020905b81548152906001019060200180831161056357829003601f168201915b5050505050905090565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156106205780601f106105f557610100808354040283529160200191610620565b820191906000526020600020905b81548152906001019060200180831161060357829003601f168201915b505050505081565b6001818154811061063557fe5b906000526020600020016000915090505481565b604051806040016040528060029060208202803883398082019150509050509056fea265627a7a72305820e835d48e802a9b511c05def6d0c6de4d13465b1e28392f3ffab024ab8ce8fe3a64736f6c63430005090032";

    public static final String FUNC_GETDATA = "getData";

    public static final String FUNC_TEST = "test";

    public static final String FUNC_SETSIMPLEDATA = "setSimpleData";

    public static final String FUNC_SETDATA = "setData";

    public static final String FUNC_GREET = "greet";

    public static final String FUNC_GREETING = "greeting";

    public static final String FUNC_DATA = "data";

    protected Hello_sol_Greeter(String contractAddress, BoxdClient client, String address, String privateKey, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, client, address, privateKey, contractGasProvider);
    }

    @Deprecated
    protected Hello_sol_Greeter(String contractAddress, BoxdClient client, String address, String privateKey, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, client, address, privateKey, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> getData(BigInteger _u) {
        final Function function = new Function(
                FUNC_GETDATA, 
                Arrays.<Type>asList(new Uint256(_u)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> test(BigInteger t) {
        final Function function = new Function(FUNC_TEST, 
                Arrays.<Type>asList(new Uint256(t)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<List> setSimpleData(List<byte[]> u) {
        final Function function = new Function(FUNC_SETSIMPLEDATA, 
                Arrays.<Type>asList(new StaticArray2<Bytes31>(
                        Bytes31.class,
                        one.contentbox.boxd.abi.Utils.typeMap(u, Bytes31.class))),
                Arrays.<TypeReference<?>>asList(new TypeReference<StaticArray2<Bytes31>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<List> setData(List<BigInteger> _u) {
        final Function function = new Function(FUNC_SETDATA, 
                Arrays.<Type>asList(new DynamicArray<Uint256>(
                        Uint256.class,
                        one.contentbox.boxd.abi.Utils.typeMap(_u, Uint256.class))),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<String> greet() {
        final Function function = new Function(FUNC_GREET, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> greeting() {
        final Function function = new Function(FUNC_GREETING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> data(BigInteger param0) {
        final Function function = new Function(FUNC_DATA, 
                Arrays.<Type>asList(new Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static Hello_sol_Greeter load(String contractAddress, BoxdClient client, String address, String privateKey, BigInteger gasPrice, BigInteger gasLimit) {
        return new Hello_sol_Greeter(contractAddress, client, address, privateKey, gasPrice, gasLimit);
    }

    public static RemoteCall<Hello_sol_Greeter> deploy(BoxdClient client, String privateKey, String address, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Hello_sol_Greeter.class, client, privateKey, address, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Hello_sol_Greeter> deploy(BoxdClient client, String privateKey, String address, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Hello_sol_Greeter.class, client, privateKey, address, gasPrice, gasLimit, BINARY, "");
    }
}
