/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-05 06:58:14 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.common.converter;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class BigDecimalConverter {
    private BigDecimalConverter() {
    }
    
    public static String toPlainString(BigDecimal bigDecimal) {
        if (Objects.isNull(bigDecimal)) {
            return null;
        }
        
        return bigDecimal.toPlainString();
    }
    
    public static BigDecimal fromPlainString(String plainString) {
        if (Objects.isNull(plainString) || plainString.trim().isEmpty()) {
            return null;
        }
        
        return new BigDecimal(plainString.trim());
    }
}
