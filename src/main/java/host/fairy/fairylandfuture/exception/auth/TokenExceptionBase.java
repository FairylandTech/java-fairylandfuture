/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:52:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.auth;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Token exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class TokenExceptionBase extends RuntimeExceptionBase {
    public TokenExceptionBase() {
        super("Token error");
    }
    
    public TokenExceptionBase(String message) {
        super(message);
    }
    
    public TokenExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
