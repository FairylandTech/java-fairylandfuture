/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-05 07:16:21 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum DateTimeFormatEnum {
    DATE("yyyy-MM-dd"),
    TIME("HH:mm:ss"),
    DATE_TIME("yyyy-MM-dd HH:mm:ss"),
    DATE_CN("yyyy年MM月dd日"),
    TIME_CN("HH时mm分ss秒"),
    DATE_TIME_CN("yyyy年MM月dd日 HH时mm分ss秒");
    
    private final String pattern;
}
