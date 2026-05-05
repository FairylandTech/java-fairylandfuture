/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-06 06:44:46 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.common.annotation;

import host.fairy.fairylandfuture.enums.AuditOperationTypeEnum;

import java.lang.annotation.*;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Audit {
    String operationName();
    
    AuditOperationTypeEnum operationType();
}
