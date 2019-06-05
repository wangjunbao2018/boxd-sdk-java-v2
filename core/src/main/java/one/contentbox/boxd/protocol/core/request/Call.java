package one.contentbox.boxd.protocol.core.request;

import lombok.Data;

/**
 * describe: Call
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/05/23
 */
@Data
public class Call {
    private String sender;
    private String contractAddr;
    private String data;
    private int height;
    private int timeout;

    private String abi;
    private String methodName;

}
