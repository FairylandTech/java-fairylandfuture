/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 02:54:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.exception.http;

import host.fairy.fairylandfuture.exception.RuntimeExceptionBase;

/**
 * HTTP related exception
 *
 * @author Beau Dean
 * @version 1.0
 */
public class HttpExceptionBase extends RuntimeExceptionBase {
    public HttpExceptionBase() {
        super("HTTP error");
    }
    
    public HttpExceptionBase(String message) {
        super(message);
    }

    public HttpExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }
}
