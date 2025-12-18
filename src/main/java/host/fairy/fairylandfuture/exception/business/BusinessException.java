/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:53:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.business;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * Business logic exception
 *
 * @author Lionel Johnson
 * @version 1.0
 */
public class BusinessException extends BaseRuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
