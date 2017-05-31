package com.common.support.enums.common;

import lombok.Getter;

/**
 * ${DESCRIPTION}
 *
 * @author csy
 * @date 2017/4/28 上午10:18
 */
@Getter
public enum EmailTemplateEn {
    RISK_SINGLE("10001", "风控-单用户"), RISK_MANY("10002", "风控-多用户"), PLATFORM_ACCESS("10003", "平台接口访问频率过高");
    private String code;
    private String name;

    EmailTemplateEn(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static EmailTemplateEn toEnumByV(String code) {
        for (EmailTemplateEn en : EmailTemplateEn.values()) {
            if (en.getCode().equals(code))
                return en;
        }
        return null;
    }
}
