/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:48:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Data validation exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class ValidationExceptionBase extends RuntimeExceptionBase {
    public ValidationExceptionBase() {
        super("Data validation failed");
    }
    
    public ValidationExceptionBase(String message) {
        super(message);
    }
    
    public ValidationExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
