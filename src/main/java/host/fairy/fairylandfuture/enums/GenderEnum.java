/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 01:22:00 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {
    FEMALE("FEMALE", "女"),
    MALE("MALE", "男"),
    UNKNOWN("UNKNOWN", "未知");

    private static final Map<String, GenderEnum> CODE_MAP = new HashMap<>();
    private static final Map<String, GenderEnum> NAME_MAP = new HashMap<>();

    static {
        for (GenderEnum gender : values()) {
            CODE_MAP.put(gender.getCode(), gender);
            NAME_MAP.put(gender.getName(), gender);
        }
    }

    private final String code;
    private final String name;

    public static GenderEnum fromCode(String code) {
        return CODE_MAP.getOrDefault(code, UNKNOWN);
    }

    public static GenderEnum fromName(String name) {
        return NAME_MAP.getOrDefault(name, UNKNOWN);
    }
}
