/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-02 18:05:54 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.serializer.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import host.fairy.fairylandfuture.enums.GenderEnum;

import java.io.IOException;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class GenderEnumSerializer extends JsonSerializer<GenderEnum> {
    @Override
    public void serialize(GenderEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getName());
    }
}
