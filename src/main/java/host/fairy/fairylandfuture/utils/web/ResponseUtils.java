/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 18:48:28 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.utils.web;

import host.fairy.fairylandfuture.common.web.response.PaginationResponse;
import host.fairy.fairylandfuture.common.web.response.Response;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class ResponseUtils {
    
    public static <T> Response<PaginationResponse<T>> buildPaginationResponse(int code, String message, PaginationResponse<T> data) {
        return new Response<>(code, message, data);
    }
}
