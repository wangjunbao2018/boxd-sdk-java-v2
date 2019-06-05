package one.contentbox.boxd.protocol.core.gas;


import one.contentbox.boxd.protocol.core.Contract;

import java.math.BigInteger;

public class DefaultGasProvider extends StaticGasProvider {
    public static final BigInteger GAS_LIMIT = Contract.GAS_LIMIT;
    public static final BigInteger GAS_PRICE = BigInteger.valueOf(22_000_000_000L);

    public DefaultGasProvider() {
        super(GAS_PRICE, GAS_LIMIT);
    }
}
