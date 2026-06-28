/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-04 20:33:35 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.domain.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Getter
@Setter
@ToString
@SuperBuilder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseMO implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    /**
     * Created time
     */
    @TableField(value = "created_at", fill = FieldFill.INSERT)
    private Instant createdAt;
    
    /**
     * Updated time
     */
    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    private Instant updatedAt;
    
    /**
     * Deleted time
     */
    @TableField(value = "deleted_at", fill = FieldFill.DEFAULT)
    private Instant deletedAt;
    
    /**
     * Enabled flag
     */
    @TableLogic(value = "Y", delval = "N")
    private String enabled;
}
