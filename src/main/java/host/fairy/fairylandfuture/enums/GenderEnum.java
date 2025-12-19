/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
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
 * @author Lionel Johnson
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {
    FEMALE(0, "female", "女"),
    MALE(1, "male", "男"),
    UNKNOWN(2, "unknown", "未知");
    
    private static final Map<String, GenderEnum> NAME_MAP = new HashMap<>();
    private static final Map<Integer, GenderEnum> CODE_MAP = new HashMap<>();
    
    static {
        for (GenderEnum gender : values()) {
            NAME_MAP.put(gender.getName(), gender);
            CODE_MAP.put(gender.getCode(), gender);
        }
    }
    
    private final int code;
    private final String name;
    private final String description;
    
    public static GenderEnum fromCode(int code) {
        return CODE_MAP.getOrDefault(code, UNKNOWN);
    }
    
    public static GenderEnum fromName(String name) {
        return NAME_MAP.getOrDefault(name, UNKNOWN);
    }
}
