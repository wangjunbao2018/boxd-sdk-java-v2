package one.contentbox.boxd.samples;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.exceptions.BoxdException;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;

import java.util.HashMap;
import java.util.Map;


/**
 * describe: SampleUtils
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/17
 */
public class SampleHelper {
//    private static String RPC_HOST = "39.97.168.26";
//    private static int RPC_PORT = 19111;

//    private static String RPC_HOST = "192.168.21.52";
//    private static int RPC_PORT = 19191;


    private static String RPC_HOST = "39.97.170.105";
    private static int RPC_PORT = 19161;

    private static String FROM_ADDR = "";
    private static Map<String, Long> toAddrs = new HashMap<>();
    static {
        toAddrs.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        toAddrs.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        toAddrs.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        toAddrs.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);
    }

    public static String CONTRACT_BIN = "608060405234801561001057600080fd5b506106f4806100206000396000f3fe60806040526004361061007d576000357c0100000000000000000000000000000000000000000000000000000000900480630178fe3f1461008257806329e99f0714610112578063624c605614610161578063c87cfe631461020f578063cfae321714610329578063ef690cc0146103b9578063f0ba844014610449575b600080fd5b34801561008e57600080fd5b506100bb600480360360208110156100a557600080fd5b8101908080359060200190929190505050610498565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156100fe5780820151818401526020810190506100e3565b505050509050019250505060405180910390f35b34801561011e57600080fd5b5061014b6004803603602081101561013557600080fd5b810190808035906020019092919050505061051e565b6040518082815260200191505060405180910390f35b34801561016d57600080fd5b506101d16004803603604081101561018457600080fd5b8101908080604001906002806020026040519081016040528092919082600260200280828437600081840152601f19601f8201169050808301925050505050509192919290505050610529565b6040518082600260200280838360005b838110156101fc5780820151818401526020810190506101e1565b5050505090500191505060405180910390f35b34801561021b57600080fd5b506102d26004803603602081101561023257600080fd5b810190808035906020019064010000000081111561024f57600080fd5b82018360208201111561026157600080fd5b8035906020019184602083028401116401000000008311171561028357600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f820116905080830192505050505050509192919290505050610539565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156103155780820151818401526020810190506102fa565b505050509050019250505060405180910390f35b34801561033557600080fd5b5061033e610543565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561037e578082015181840152602081019050610363565b50505050905090810190601f1680156103ab5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156103c557600080fd5b506103ce6105e5565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561040e5780820151818401526020810190506103f3565b50505050905090810190601f16801561043b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561045557600080fd5b506104826004803603602081101561046c57600080fd5b8101908080359060200190929190505050610683565b6040518082815260200191505060405180910390f35b60606001829080600181540180825580915050906001820390600052602060002001600090919290919091505550600180548060200260200160405190810160405280929190818152602001828054801561051257602002820191906000526020600020905b8154815260200190600101908083116104fe575b50505050509050919050565b600060649050919050565b6105316106a6565b819050919050565b6060819050919050565b606060008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156105db5780601f106105b0576101008083540402835291602001916105db565b820191906000526020600020905b8154815290600101906020018083116105be57829003601f168201915b5050505050905090565b60008054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561067b5780601f106106505761010080835404028352916020019161067b565b820191906000526020600020905b81548152906001019060200180831161065e57829003601f168201915b505050505081565b60018181548110151561069257fe5b906000526020600020016000915090505481565b604080519081016040528060029060208202803883398082019150509050509056fea165627a7a72305820ea2fd8ea7eade98829946cc25f8ee92aff806dce1dc83e9a837168526d86926c0029";

    public static String faucet(String addr, long amount) throws BoxdException {
        return getBoxdClient().facuet(addr, amount);
    }

    public static long balance(String addr) throws BoxdException {
        return getBoxdClient().getBalance(addr);
    }

    public static BoxdClient getBoxdClient() {
        BoxdClient client = new RpcBoxdClientImpl(RPC_HOST, RPC_PORT);
        return client;
    }

    public static String formatJavaObject(Object object){
        return JSON.toJSONString(object, true);
    }

    public static String formatProtobufObject(MessageOrBuilder messageOrBuilder) throws BoxdException{
        try {
            return JsonFormat.printer().print(messageOrBuilder);
        }catch (InvalidProtocolBufferException e){
            throw new BoxdException(-1, e.getMessage());
        }
    }

    public static void viewTx(String hash, BoxdClient client) throws Exception {
        Thread.sleep(1000);
        ExtendTxDetail txDetail = client.viewTxDetail(hash, false);
        System.out.println(JSON.toJSONString(txDetail));
    }

}