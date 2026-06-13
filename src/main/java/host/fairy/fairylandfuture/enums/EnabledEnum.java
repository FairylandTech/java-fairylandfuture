/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
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
 * @author Beau Dean
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum EnabledEnum {
    ENABLED("Y", "启用"),
    DISABLED("N", "禁用");

    private static final Map<String, EnabledEnum> CODE_MAP = new HashMap<>();
    private static final Map<String, EnabledEnum> NAME_MAP = new HashMap<>();

    static {
        for (EnabledEnum enabledStatus : values()) {
            CODE_MAP.put(enabledStatus.getCode(), enabledStatus);
            NAME_MAP.put(enabledStatus.getName(), enabledStatus);
        }
    }

    private final String code;
    private final String name;

    public static EnabledEnum fromCode(String code) {
        return CODE_MAP.getOrDefault(code, null);
    }

    public static EnabledEnum fromName(String name) {
        return NAME_MAP.getOrDefault(name, null);
    }
}
