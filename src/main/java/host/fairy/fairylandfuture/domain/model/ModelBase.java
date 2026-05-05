/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:26:11 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import host.fairy.fairylandfuture.enums.EnabledEnum;
import host.fairy.fairylandfuture.serializer.jackson.EnabledEnumSerializer;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ModelBase extends DomainBase<EnabledEnum> {
    
    private Long id;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;
    
    @JsonSerialize(using = EnabledEnumSerializer.class)
    private EnabledEnum enabled;
}
