/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-03-02 20:23:30 UTC+08:00
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
public enum EnabledStatusEnum {
    ENABLED(1, "Y", "启用"),
    DISABLED(0, "N", "禁用");
    
    private static final Map<Integer, EnabledStatusEnum> CODE_MAP = new HashMap<>();
    private static final Map<String, EnabledStatusEnum> VALUE_MAP = new HashMap<>();
    private static final Map<String, EnabledStatusEnum> DESCRIPTION_MAP = new HashMap<>();
    
    static {
        for (EnabledStatusEnum enabledStatus : values()) {
            CODE_MAP.put(enabledStatus.getCode(), enabledStatus);
            VALUE_MAP.put(enabledStatus.getValue(), enabledStatus);
            DESCRIPTION_MAP.put(enabledStatus.getDescription(), enabledStatus);
        }
    }
    
    private final int code;
    private final String value;
    private final String description;
    
    public static EnabledStatusEnum fromCode(int code) {
        return CODE_MAP.getOrDefault(code, null);
    }
    
    public static EnabledStatusEnum fromValue(String value) {
        return VALUE_MAP.getOrDefault(value, null);
    }
    
    public static EnabledStatusEnum fromDescription(String description) {
        return DESCRIPTION_MAP.getOrDefault(description, null);
    }
}
