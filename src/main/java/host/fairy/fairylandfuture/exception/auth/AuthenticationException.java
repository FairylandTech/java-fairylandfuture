/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:50:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.auth;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * Authentication exception
 *
 * @author Lionel Johnson
 * @version 1.0
 */
public class AuthenticationException extends BaseRuntimeException {
    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
