/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:49:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.common;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * Parameter exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class ParameterExceptionBase extends RuntimeExceptionBase {
    public ParameterExceptionBase() {
        super("Invalid parameter");
    }
    
    public ParameterExceptionBase(String message) {
        super(message);
    }
    
    public ParameterExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
