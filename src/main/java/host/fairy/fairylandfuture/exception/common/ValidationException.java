/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:48:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * Data validation exception
 *
 * @author Lionel Johnson
 * @version 1.0
 */
public class ValidationException extends BaseRuntimeException {
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
