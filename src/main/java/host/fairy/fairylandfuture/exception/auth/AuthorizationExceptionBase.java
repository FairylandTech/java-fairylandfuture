/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:51:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.auth;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Authorization exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class AuthorizationExceptionBase extends RuntimeExceptionBase {
    public AuthorizationExceptionBase() {
        super("Unauthorized");
    }
    
    public AuthorizationExceptionBase(String message) {
        super(message);
    }
    
    public AuthorizationExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
