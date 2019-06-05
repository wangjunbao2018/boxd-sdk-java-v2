package one.contentbox.boxd.protocol.core.request;

import lombok.Data;

import java.math.BigInteger;

/**
 * describe: ContractTx
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/05/22
 */
@Data
public class ContractTx {

    private String sender;
    private long amount;
    private BigInteger gasPrice;
    private BigInteger gasLimit;
    private long nonce;
    private boolean isDeployed;
    private String contractAddr;
    private String data;
}
