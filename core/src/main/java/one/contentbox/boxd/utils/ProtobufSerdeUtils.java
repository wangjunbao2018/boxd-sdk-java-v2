package one.contentbox.boxd.utils;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import one.contentbox.boxd.protocol.exceptions.BoxdException;
import org.slf4j.Logger;

/**
 * describe: ProtobufSerdeUtils
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class ProtobufSerdeUtils {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ProtobufSerdeUtils.class);

    public static  <T> T  protobufToJavaBean(MessageOrBuilder messageOrBuilder, Class<T> t)
            throws BoxdException {
            try {
                String json = JsonFormat.printer().print(messageOrBuilder);
                T d = JSON.parseObject(json, t);
                return d;
           }catch (InvalidProtocolBufferException e) {
                throw new BoxdException(-1, e.getMessage());
           }
    }

}
