package one.contentbox.boxd.samples.contracts;

import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.rpc.solidity.generated.Hello_sol_Greeter;
import one.contentbox.boxd.samples.SampleHelper;

import java.math.BigInteger;

public class HelloContractSample {

    private static String address = "b1ndoQmEd83y4Fza5PzbUQDYpT3mV772J5o";
    private static String privKey = "51bbcc29adedb59ef3e99d7f7b390517443dd121cc46424562f79619a642422c";

    private static BigInteger gasLimit = new BigInteger("400000");
    private static BigInteger gasPrice = new BigInteger("20");

    public static void main(String[] args) throws Exception{

        BoxdClient boxdClient = SampleHelper.getBoxdClient();
        Hello_sol_Greeter hello_sol_greeter = Hello_sol_Greeter.deploy(boxdClient, privKey, address, gasPrice, gasLimit).send();
        System.out.println(hello_sol_greeter.getContractAddress());

        Thread.sleep(5 * 1000);

        String contractAdderss = "b5cjJsqbERut5bNbv8VTmxenPg6KxvZukF7";
        contractAdderss = hello_sol_greeter.getContractAddress();
        Hello_sol_Greeter loadedHello = Hello_sol_Greeter.load(contractAdderss, boxdClient, address, privKey, gasPrice, gasLimit);
        String greet = loadedHello.greet().send();
        System.out.println(greet);
    }
}
