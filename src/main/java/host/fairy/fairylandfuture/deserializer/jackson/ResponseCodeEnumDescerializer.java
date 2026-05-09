/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-08 20:40:48 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.deserializer.jackson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import host.fairy.fairylandfuture.enums.ResponseCodeEnum;

import java.io.IOException;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class ResponseCodeEnumDescerializer extends JsonDeserializer<ResponseCodeEnum> {
    @Override
    public ResponseCodeEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        return ResponseCodeEnum.fromCode(p.getIntValue());
    }
}
