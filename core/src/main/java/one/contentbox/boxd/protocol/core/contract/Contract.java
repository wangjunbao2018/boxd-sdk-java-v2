package one.contentbox.boxd.protocol.core.contract;

import lombok.Data;
import one.contentbox.boxd.abi.datatypes.Function;
import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.util.encoders.Hex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * describe: Contract
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/05/28
 */

@Data
public class Contract {

        private String abi;
        private String bin;

        public Contract(String abi, String bin){
            this.abi = abi;
            this.bin = bin;
        }


}
