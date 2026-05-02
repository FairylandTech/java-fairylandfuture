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
    FEMALE(0, "FEMALE", "女"),
    MALE(1, "MALE", "男"),
    UNKNOWN(2, "UNKNOWN", "未知");
    
    private static final Map<String, GenderEnum> NAME_MAP = new HashMap<>();
    private static final Map<Integer, GenderEnum> CODE_MAP = new HashMap<>();
    private static final Map<String, GenderEnum> DESCRIPTION_MAP = new HashMap<>();
    
    static {
        for (GenderEnum gender : values()) {
            NAME_MAP.put(gender.getName(), gender);
            CODE_MAP.put(gender.getCode(), gender);
            DESCRIPTION_MAP.put(gender.getDescription(), gender);
        }
    }
    
    private final int code;
    private final String name;
    private final String description;
    
    public static GenderEnum fromCode(int code) {
        return CODE_MAP.getOrDefault(code, null);
    }
    
    public static GenderEnum fromName(String name) {
        return NAME_MAP.getOrDefault(name, null);
    }
    
    public static GenderEnum fromDescription(String description) {
        return DESCRIPTION_MAP.getOrDefault(description, null);
    }
}
