/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-05 07:11:14 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.common.converter;

import host.fairy.fairylandfuture.enums.DateTimeFormatEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class DateTimeConverter {
    private DateTimeConverter() {
    }
    
    public static String toString(LocalDateTime src) {
        return src == null ? null : src.toString();
    }
    
    public static String toString(LocalDateTime src, String pattern) {
        return src == null ? null : src.format(DateTimeFormatter.ofPattern(pattern));
    }
    
    public static String toString(LocalDateTime src, DateTimeFormatEnum pattern) {
        return src == null ? null : src.format(DateTimeFormatter.ofPattern(pattern.getPattern()));
    }
    
    public static String toString(LocalDateTime src, DateTimeFormatter formatter) {
        return src == null ? null : src.format(formatter);
    }
    
    public static LocalDateTime toLocalDateTime(String src) {
        return src == null ? null : LocalDateTime.parse(src);
    }
    
    public static LocalDateTime toLocalDateTime(String src, String pattern) {
        return src == null ? null : LocalDateTime.parse(src, DateTimeFormatter.ofPattern(pattern));
    }
    
    public static LocalDateTime toLocalDateTime(String src, DateTimeFormatEnum pattern) {
        return src == null ? null : LocalDateTime.parse(src, DateTimeFormatter.ofPattern(pattern.getPattern()));
    }
    
    public static LocalDateTime toLocalDateTime(String src, DateTimeFormatter formatter) {
        return src == null ? null : LocalDateTime.parse(src, formatter);
    }
}
