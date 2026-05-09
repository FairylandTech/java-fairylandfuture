/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 18:30:53 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.common.web.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import host.fairy.fairylandfuture.deserializer.jackson.ResponseCodeEnumDescerializer;
import host.fairy.fairylandfuture.enums.ResponseCodeEnum;
import host.fairy.fairylandfuture.serializer.jackson.ResponseCodeEnumSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> implements Serializable {
    
    @JsonSerialize(using = ResponseCodeEnumSerializer.class)
    @JsonDeserialize(using = ResponseCodeEnumDescerializer.class)
    private ResponseCodeEnum code;
    private String message;
    private T data;
    
    public static <T> Response<T> success() {
        return Response.<T>builder()
                .code(ResponseCodeEnum.SUCCESS)
                .message(ResponseCodeEnum.SUCCESS.getName())
                .build();
    }
    
    public static <T> Response<T> success(ResponseCodeEnum code) {
        return Response.<T>builder()
                .code(code)
                .message(code.getName())
                .build();
    }
    
    public static <T> Response<T> success(ResponseCodeEnum code, String message) {
        return Response.<T>builder()
                .code(code)
                .message(message)
                .build();
    }
    
    public static <T> Response<T> success(T data) {
        return Response.<T>builder()
                .code(ResponseCodeEnum.SUCCESS)
                .message(ResponseCodeEnum.SUCCESS.getName())
                .data(data)
                .build();
    }
    
    public static <T> Response<T> success(ResponseCodeEnum code, String message, T data) {
        return Response.<T>builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
    
    public static <T> Response<T> failure(String message) {
        return Response.<T>builder()
                .code(ResponseCodeEnum.ERROR)
                .message(message)
                .build();
    }
    
    public static <T> Response<T> failure(ResponseCodeEnum code, String message) {
        return Response.<T>builder()
                .code(code)
                .message(message)
                .build();
    }
    
    public static <T> Response<T> failure(ResponseCodeEnum code, String message, T data) {
        return Response.<T>builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
}
