/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:53:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.business;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Business logic exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class BusinessExceptionBase extends RuntimeExceptionBase {
    public BusinessExceptionBase() {
        super("Business logic error");
    }
    
    public BusinessExceptionBase(String message) {
        super(message);
    }

    public BusinessExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
