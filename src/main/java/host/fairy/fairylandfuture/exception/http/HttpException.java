/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:54:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.http;

import host.fairy.fairylandfuture.exception.BaseRuntimeException;

/**
 * HTTP related exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class HttpException extends BaseRuntimeException {
    public HttpException() {
        super("HTTP error");
    }
    
    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }
}
