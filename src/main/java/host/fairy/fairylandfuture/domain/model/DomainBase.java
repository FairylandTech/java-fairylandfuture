/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-04 20:58:08 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DomainBase<T> implements Serializable {
    private Long id;
    
    private Instant createdAt;
    
    private Instant updatedAt;
    
    private T enabled;
}
