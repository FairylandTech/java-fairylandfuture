/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 22:21:51 UTC+08:00
 ****************************************************/
package h.f.f.utils.authentication;

import host.fairy.fairylandfuture.utils.authentication.UserPasswordUtils;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class TestUserPasswordUtils {
    @Test
    void testUserPassword() {
        
        System.out.println(Arrays.toString("我".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString("0".getBytes(StandardCharsets.UTF_8)));
        
        byte[] bytes = new byte[]{-26, -120, -111};
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
        
        String password = "123456";
        
        byte[] salt = UserPasswordUtils.generateSalt();
        System.out.println("Salt(Base64): " + Arrays.toString(salt));
        String encryptedPassword = UserPasswordUtils.hashPassword(password, salt);
        System.out.println("HashPassword(MD5): " + encryptedPassword);
        
        boolean match = UserPasswordUtils.verifyPassword(password, encryptedPassword, salt);
        System.out.println("密码校验: " + (match ? "通过" : "失败"));
    }
}
