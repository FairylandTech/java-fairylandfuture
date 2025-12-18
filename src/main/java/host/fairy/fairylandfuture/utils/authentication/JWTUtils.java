/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:28:36 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.utils.authentication;

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
 * @author Lionel Johnson
 * @version 1.0
 */
public class JWTUtils {
    
    /**
     * Generate JWT Token
     *
     * @param sercret   Secret key
     * @param ttlSecond Token time to live in seconds
     * @param claims    Claims
     * @return JWT Token
     */
    public static String generateToken(String sercret, Long ttlSecond, Map<String, ?> claims) {
        
        long expiration = LocalDateTime.now().plusSeconds(ttlSecond).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        
        JwtBuilder jwtBuilder = Jwts.builder()
                .claims(claims)
                .signWith(Keys.hmacShaKeyFor(sercret.getBytes(StandardCharsets.UTF_8)))
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
        return Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
