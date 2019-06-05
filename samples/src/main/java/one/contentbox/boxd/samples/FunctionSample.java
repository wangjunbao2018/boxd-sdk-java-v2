package one.contentbox.boxd.samples;

import one.contentbox.boxd.abi.FunctionEncoder;
import one.contentbox.boxd.abi.FunctionReturnDecoder;
import one.contentbox.boxd.abi.TypeReference;
import one.contentbox.boxd.abi.datatypes.Function;
import one.contentbox.boxd.abi.datatypes.Type;
import one.contentbox.boxd.abi.datatypes.generated.Uint256;
import one.contentbox.boxd.protocol.core.RemoteCall;

import java.util.Arrays;
import java.util.List;

public class FunctionSample {
    public static void main(String args[]) {
        String result = "0x0000000000000000000000000000000000000000000000000000000000000064";
        final Function function = new Function("test",
                Arrays.<Type>asList(new one.contentbox.boxd.abi.datatypes.generated.Uint256(100)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));

        System.out.println(FunctionEncoder.encode(function));
        List<Type> list = FunctionReturnDecoder.decode(result, function.getOutputParameters());
        System.out.println(list.get(0).getValue());
    }
}
