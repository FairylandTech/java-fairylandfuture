/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 03:00:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * Resource not found exception
 *
 * @author Lionel Johnson
 * @version 1.0
 */
public class ResourceNotFoundException extends BaseRuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
