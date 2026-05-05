/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 03:05:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * System exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class SystemExceptionBase extends RuntimeExceptionBase {
    public SystemExceptionBase() {
        super("System error");
    }
    
    public SystemExceptionBase(String message) {
        super(message);
    }
    
    public SystemExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
