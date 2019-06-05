package one.contentbox.boxd.samples;

import com.google.common.primitives.Longs;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.request.Call;
import one.contentbox.boxd.protocol.core.request.ContractTx;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedContractTx;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;
import one.contentbox.boxd.utils.ArrayUtils;
import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.slf4j.Logger;

import java.math.BigInteger;

public class ContractSample {


    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ContractSample.class);
    private static BoxdClient client = SampleHelper.getBoxdClient();

//    private static String address = "b1WpdQ1odtmVEMqTTTmpT5xjbudTJg1jtvX"; //"b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
//    private static String privKey = "4fd7346602d5fae2404efca9a35ba2ba470fffed1672d52f8581845e424179be"; //"29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";

//    private static String address = "b1jW8ervf5TnxTyfUHEL51PBwrUcL9y8sqZ";
//    private static String privKey = "008d82cc061710b30310634a787e6ddfafe31f8b80a1074d33171be16635753dcf";


//
//    private static String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
//    private static String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";
//

//    // jingshi
    private static String address = "b1ndoQmEd83y4Fza5PzbUQDYpT3mV772J5o";
    private static String privKey = "51bbcc29adedb59ef3e99d7f7b390517443dd121cc46424562f79619a642422c";

    private static BigInteger gasLimit = BigInteger.valueOf(500000);
    private static BigInteger gasPrice = BigInteger.valueOf(20);

    public static long getNonce(String address) throws Exception {
        return client.getNonce(address);
    }

    public static UnsignedContractTx createUnsignedContractTx(long nonce, String data) throws Exception {
        ContractTx contractTx = new ContractTx();
        contractTx.setSender(address);
        contractTx.setAmount(0);
        contractTx.setData(data);

        contractTx.setDeployed(true);
        contractTx.setGasLimit(gasLimit);
        contractTx.setGasPrice(gasPrice);
        contractTx.setNonce(nonce + 1);
        UnsignedContractTx unsignedContractTx = client.makeUnsignedContractTx(contractTx);
        System.out.println(unsignedContractTx.getContractAddr());
        return unsignedContractTx;
    }

    public static Transaction signTx(UnsignedContractTx unsignedContractTx, String privKey) throws Exception {
        return client.signTransaction(unsignedContractTx, privKey);
    }

    public static String sendTx(Transaction transaction) throws Exception {
        return client.sendTransaction(transaction);
    }


    public static String callContract(long nonce, String contractAddr, String data) throws Exception {
        ContractTx contractTx = new ContractTx();
        contractTx.setSender(address);
        contractTx.setAmount(100);
        contractTx.setContractAddr(contractAddr);
        contractTx.setData(data);
        contractTx.setDeployed(false);
        contractTx.setGasLimit(gasLimit);
        contractTx.setGasPrice(gasPrice);
        contractTx.setNonce(nonce + 1);
        UnsignedContractTx unsignedContractTx = client.makeUnsignedContractTx(contractTx);
        Transaction transaction = client.signTransaction(unsignedContractTx, privKey);
        String hash = client.sendTransaction(transaction);
        return hash;
    }


    public static String doCall(String contractAddr, String sender, String data) throws Exception {
        Call call = new Call();
        call.setContractAddr(contractAddr);
        call.setTimeout(0);
        call.setSender(sender);
        call.setHeight(0);
        call.setData(data);
        String resp = client.call(call);
        return resp;
    }

//    public static byte[] buildInput(String methodName, String fromAddr, Long gasLimit) {
//        byte[] method = sha3(methodName.getBytes(), 0, methodName.length());
//        byte[] methodId = org.apache.commons.lang3.ArrayUtils.subarray(method, 0, 4);
//        byte[] tmp = ArrayUtils.join(methodId, sha3(fromAddr.getBytes(), 0, fromAddr.length()));
//        byte[] result = ArrayUtils.join(tmp, Longs.toByteArray(gasLimit));
//        return result;
//    }


    /**
     * Keccak-256 hash function.
     *
     * @param input  binary encoded input data
     * @param offset of start of data
     * @param length of data
     * @return hash value
     */
    public static byte[] sha3(byte[] input, int offset, int length) {
        Keccak.DigestKeccak kecc = new Keccak.Digest256();
        kecc.update(input, offset, length);
        return kecc.digest();
    }

    public static void main(String[] args) throws Exception {

//        client.facuet(address, gasLimit * gasPrice * 10);
//        Thread.sleep(5*1000);

//        long balance = client.getBalance(address);
//        System.out.println(balance);
//
//
//        long nonce = getNonce(address);
//        UnsignedContractTx unsignedContractTx = createUnsignedContractTx(nonce, SampleHelper.CONTRACT_BIN);
//        Transaction tx = signTx(unsignedContractTx, privKey);
//        String txHash = sendTx(tx);
//        System.out.println(txHash);
//
//
//        Thread.sleep(5*1000);
//        SampleHelper.viewTx(txHash, client);


//        String contractAddr = "b5sjct5PkWMUdGsyvtmW1PEYmNuyByoQoed";
//        String data = "0178fe3f0000000000000000000000000000000000000000000000000000000000000064";
//        long nonce = getNonce(address);
//        String txHash = callContract(nonce, contractAddr, data);
//        Thread.sleep(5 * 1000);
        String txHash = "854c8e3231a86363e9d7c8ca89908dc689a827e16652af5c46560087888d2f3e";
        SampleHelper.viewTx(txHash, client);
    }
}