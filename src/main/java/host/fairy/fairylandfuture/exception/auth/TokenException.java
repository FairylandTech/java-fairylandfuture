/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:52:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.auth;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * Token exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class TokenException extends BaseRuntimeException {
    public TokenException() {
        super("Token error");
    }
    
    public TokenException(String message) {
        super(message);
    }
    
    public TokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
