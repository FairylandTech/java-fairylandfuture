/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:31:06 UTC+08:00
 ****************************************************/
package h.f.f.utils.authentication;

import host.fairy.fairylandfuture.utils.authentication.JWTUtils;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class TestJWTUtils {
    private final String SECRET_KEY = "7QXqrqtaWVwOAV0ACT4sDRvmIDXvv6XQqymI/iabs/U=";
    
    @Test
    void testGenerateToken() {
        Long ttlSecond = 72000L;
        Map<String, String> claims = new HashMap<>() {
            {
                put("id", "1");
                put("username", "admin");
            }
        };
        String token = JWTUtils.generateToken(this.SECRET_KEY, ttlSecond, claims);
        System.out.println(token); // eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjEiLCJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzY2MDgzMTEyfQ.eePzCsr184_n1zg53JI8jm4aDzfA-l9YJ9OtZaerShE
    }
    
    @Test
    void testParseToken() {
        Long ttlSecond = 72000L;
        Map<String, String> claimsMap = new HashMap<>() {
            {
                put("id", "1");
                put("username", "admin");
            }
        };
        String token = JWTUtils.generateToken(this.SECRET_KEY, ttlSecond, claimsMap);
        Claims claims = JWTUtils.parseToken(token, this.SECRET_KEY);
        String id = claims.get("id", String.class);
        String username = claims.get("username", String.class);
        
        System.out.println("claims.getExpiration().toString() = " + claims.getExpiration().toString());
        
        assert id.equals("1");
        assert username.equals("admin");
    }
    
}
