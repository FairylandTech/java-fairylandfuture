/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-03-02 22:12:57 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.serializer.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import host.fairy.fairylandfuture.enums.EnabledStatusEnum;

import java.io.IOException;

/**
 * @author Lionel Johnson
 * @version 1.0
 */
public class EnabledStatusEnumSerializer extends JsonSerializer<EnabledStatusEnum> {
    
    @Override
    public void serialize(EnabledStatusEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getDescription());
    }
}
