package one.contentbox.boxd.crypto.keystore;

import one.contentbox.boxd.crypto.util.Utils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.*;
import java.security.spec.ECGenParameterSpec;

/**
 * Crypto key utilities.
 */
public class Keys {

    static {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    private Keys() { }

    /**
     * Create a keypair using SECP-256k1 curve.
     *
     * <p>Private keypairs are encoded using PKCS8
     *
     * <p>Private keys are encoded using X.509
     */
    static KeyPair createSecp256k1KeyPair() throws NoSuchProviderException,
            NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        return createSecp256k1KeyPair(Utils.SecureRandom());
    }

    static KeyPair createSecp256k1KeyPair(SecureRandom random) throws NoSuchProviderException,
            NoSuchAlgorithmException, InvalidAlgorithmParameterException {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDSA", "BC");
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256k1");
        if (random != null) {
            keyPairGenerator.initialize(ecGenParameterSpec, random);
        } else {
            keyPairGenerator.initialize(ecGenParameterSpec);
        }

        java.security.KeyPair  keyPair = keyPairGenerator.generateKeyPair();
        return new KeyPair(keyPair.getPublic(), keyPair.getPrivate());
    }

    public static ECKeyPair createEcKeyPair() throws InvalidAlgorithmParameterException,
            NoSuchAlgorithmException, NoSuchProviderException {
        return createEcKeyPair(Utils.SecureRandom());
    }

    public static ECKeyPair createEcKeyPair(SecureRandom random) throws
            InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        KeyPair keyPair = createSecp256k1KeyPair(random);
        return ECKeyPair.create(keyPair);
    }

}