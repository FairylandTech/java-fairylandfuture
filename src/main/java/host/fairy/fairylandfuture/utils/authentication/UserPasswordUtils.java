/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 22:18:01 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.utils.authentication;

import host.fairy.fairylandfuture.utils.encryption.MD5Utils;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Objects;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class UserPasswordUtils {
    // Fixed salt values (in practice, unique salt values should be generated for each user and stored in the database)
    public static final String SALT = "VVcnT0FHQ1ySK5W5QmBvgQ==";
    // Algorithmic parameter
    private static final String ALGORITHM = "PBKDF2WithHmacSHA256";
    // Salt value length (bytes)
    private static final int SALT_LENGTH = 16;
    // Export key length (bits)
    private static final int KEY_LENGTH = 256;
    // Number of iterations
    private static final int ITERATIONS = 65536;
    private static final SecureRandom RANDOM = new SecureRandom();
    
    private UserPasswordUtils() {
    }
    
    /**
     * Generate random salt values
     *
     * @return Base64 Coded salt values
     */
    public static byte[] generateSalt() {
        byte[] salt = new byte[SALT_LENGTH];
        RANDOM.nextBytes(salt);
        return salt;
    }
    
    /**
     * Hash the password
     *
     * @param password Original plaintext password
     * @param salt     Base64 encoded salt values
     * @return Base64 Encoded hash results
     */
    public static String hashPassword(String password, byte[] salt) {
        Objects.requireNonNull(password, "Password cannot be null");
        Objects.requireNonNull(salt, "Salt cannot be null");
        
        try {
            PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] hash = skf.generateSecret(spec).getEncoded();
            return MD5Utils.md5HEX(Base64.getEncoder().encodeToString(hash));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException("Unable to generate password hash", e);
        }
    }
    
    /**
     * Verify password match
     *
     * @param srcPassword    User-entered passwords in clear text
     * @param targetPassword Base64 hash stored
     * @param salt           Base64 salts stored
     * @return Match returns true, otherwise false
     */
    public static boolean verifyPassword(String srcPassword, String targetPassword, byte[] salt) {
        String newHash = hashPassword(srcPassword, salt);
        return newHash.equals(targetPassword);
    }
}
