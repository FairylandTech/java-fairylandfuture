/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 03:00:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Resource not found exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class ResourceNotFoundExceptionBase extends RuntimeExceptionBase {
    public ResourceNotFoundExceptionBase() {
        super("Resource not found");
    }
    
    public ResourceNotFoundExceptionBase(String message) {
        super(message);
    }
    
    public ResourceNotFoundExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
