/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:28:36 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.utils.authentication;

import host.fairy.fairylandfuture.exception.common.ParameterException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * JWT Utils
 *
 * @author Beau Dean
 * @version 1.0
 */
public class JWTUtils {
    
    private JWTUtils() {
    }
    
    /**
     * Generate JWT Token. <br/>
     * Algorithm: HS256, when secret key bits length <= 256 bits. <br/>
     * Algorithm: HS384, when secret key bits length <= 384 bits. <br/>
     * Algorithm: HS512, when secret key bits length >= 512 bits. <br/>
     * Calc bits length: bits = bytes length * 8
     *
     * @param secret    Secret key, should be at least 256 bits (32 bytes) for HS256
     * @param ttlSecond Token time to live in seconds
     * @param claims    Claims
     * @return JWT Token
     */
    public static String generateToken(String secret, Long ttlSecond, Map<String, ?> claims) {
        if (secret == null || secret.isEmpty()) {
            throw new ParameterException("Secret Key connot be null or empty");
        }
        
        long expiration = LocalDateTime.now().plusSeconds(ttlSecond).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        
        JwtBuilder jwtBuilder = Jwts.builder()
                .claims(claims)
                .signWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
                .expiration(new Date(expiration));
        
        return jwtBuilder.compact();
    }
    
    /**
     * Parse JWT Token
     *
     * @param token  JWT Token
     * @param secret Secret key
     * @return Claims
     */
    public static Claims parseToken(String token, String secret) {
        if (secret == null || secret.isEmpty()) {
            throw new ParameterException("Secret Key connot be null or empty");
        }
        
        return Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
