package one.contentbox.boxd.protocol.core.response.tx;

import lombok.Data;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeContractTxResp;

/**
 * describe: UnsignedContractTx
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/05/22
 */
@Data
public class UnsignedContractTx extends UnsignedTx {

    private String contractAddr;


    public UnsignedContractTx(MakeContractTxResp makeContractTxResp){
        super(makeContractTxResp.getTx(), makeContractTxResp.getRawMsgsList());
        this.contractAddr = makeContractTxResp.getContractAddr();
    }
}
