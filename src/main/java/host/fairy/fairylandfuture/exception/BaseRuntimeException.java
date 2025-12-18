/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:46:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception;

/**
 * Base runtime exception class
 *
 * @author Lionel Johnson
 * @version 1.0
 */
public class BaseRuntimeException extends RuntimeException {
    public BaseRuntimeException(String message) {
        super(message);
    }

    public BaseRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
