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

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class TestUserPasswordUtils {
    @Test
    void testUserPassword() {
        String password = "123456";
        // 注册时: 生成盐值并计算哈希，然后将它们存入数据库
        String salt = UserPasswordUtils.generateSalt();
        System.out.println("salt = " + salt);
        String hash = UserPasswordUtils.hashPassword(password.toCharArray(), UserPasswordUtils.SALT);
        System.out.println("Salt(Base64): " + UserPasswordUtils.SALT);
        System.out.println("Hash(Base64): " + hash);
        
        // 登录时: 从数据库取出 salt 和 hash，再对用户输入的密码做同样运算并校验
        boolean match = UserPasswordUtils.verifyPassword("123456".toCharArray(), hash, UserPasswordUtils.SALT);
        System.out.println("密码校验: " + (match ? "通过" : "失败"));
    }
}
