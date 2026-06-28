/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:26:11 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.domain.model;

import host.fairy.fairylandfuture.enums.EnabledEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@SuperBuilder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class DomainModelBase implements Serializable {
    /**
     * ID
     */
    private Long id;
    
    /**
     * Created time
     */
    private Instant createdAt;
    
    /**
     * Updated time
     */
    private Instant updatedAt;
    
    /**
     * Deleted time
     */
    private Instant deletedAt;
    
    /**
     * Enabled flag
     */
    private EnabledEnum enabled;
}
