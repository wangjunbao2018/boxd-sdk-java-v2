package one.contentbox.boxd.samples;

import com.alibaba.fastjson.JSON;
import one.contentbox.boxd.protocol.BoxdDaemon;
import one.contentbox.boxd.protocol.exceptions.BoxdException;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail;
import one.contentbox.boxd.protocol.subscribe.BlockListener;
import one.contentbox.boxd.utils.ProtobufSerdeUtils;
import org.slf4j.Logger;

public class BoxdDaemonSample {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BoxdDaemonSample.class);

    public static void main(String args[]) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;

        BoxdDaemon boxdDaemon = new BoxdDaemon(host, port);
        boxdDaemon.setBlockListener(new BlockListener() {
            @Override
            public void blockDetected(BlockDetail blockDetail) {
                try {
                    one.contentbox.boxd.protocol.core.response.block.BlockDetail bd = ProtobufSerdeUtils
                            .protobufToJavaBean(blockDetail, one.contentbox.boxd.protocol.core.response.block.BlockDetail.class);

                    System.out.println(JSON.toJSONString(bd, true));
                }catch (BoxdException e){
                    e.printStackTrace();
                }
            }
        });

        boxdDaemon.start();
    }
}
