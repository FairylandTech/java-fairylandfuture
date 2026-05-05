/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:50:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.auth;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Authentication exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class AuthenticationExceptionBase extends RuntimeExceptionBase {
    public AuthenticationExceptionBase() {
        super("Authentication failed");
    }
    
    public AuthenticationExceptionBase(String message) {
        super(message);
    }
    
    public AuthenticationExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
