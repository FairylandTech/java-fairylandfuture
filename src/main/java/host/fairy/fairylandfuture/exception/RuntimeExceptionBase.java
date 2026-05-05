/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:46:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception;

/**
 * Base runtime exception class
 *
 * @author Beau Dean
 * @version 1.0
 */
public class RuntimeExceptionBase extends RuntimeException {
    public RuntimeExceptionBase() {
        super("An error occurred");
    }
    
    public RuntimeExceptionBase(String message) {
        super(message);
    }
    
    public RuntimeExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
