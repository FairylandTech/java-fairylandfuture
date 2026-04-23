/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:45:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception;

/**
 * Base checked exception class
 *
 * @author Beau Dean
 * @version 1.0
 */
public class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
