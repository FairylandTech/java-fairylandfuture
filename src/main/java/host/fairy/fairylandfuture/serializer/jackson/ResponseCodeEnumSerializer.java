/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-03-07 13:55:50 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.serializer.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import host.fairy.fairylandfuture.enums.ResponseCodeEnum;

import java.io.IOException;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class ResponseCodeEnumSerializer extends JsonSerializer<ResponseCodeEnum> {
    @Override
    public void serialize(ResponseCodeEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(value.getCode());
    }
}
