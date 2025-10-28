package com.hypo.appstoreprice.pojo.enums;

import cn.hutool.core.util.StrUtil;
import com.hypo.appstoreprice.common.BizException;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * area enum
 * https://www.apple.com/choose-country-region/
 * https://www.exchangerate-api.com/docs/supported-currencies
 * https://www.zhihu.com/question/23095211
 *
 * @author hypo
 * @date 2025-09-16
 */
@Getter
@AllArgsConstructor
public enum AreaEnum {

    USA("us", "美国", "$", "USD", StrUtil.COMMA),

    CHINA("cn", "中国", "¥", "CNY", StrUtil.COMMA),

    TAIWAN("tw", "台湾", "NT$", "TWD", StrUtil.COMMA),

    HONGKONG("hk", "香港", "HK$", "HKD", StrUtil.COMMA),

    JAPAN("jp", "日本", "¥", "JPY", StrUtil.COMMA),

    KOREA("kr", "韩国", "₩", "KRW", StrUtil.COMMA),

    TURKEY("tr", "土耳其", "₺", "TRY", StrUtil.DOT),

    NIGERIA("ng", "尼日利亚", "₦", "NGN", StrUtil.COMMA),

    INDIA("in", "印度", "₹", "INR", StrUtil.COMMA),

    PAKISTAN("pk", "巴基斯坦", "₨", "PKR", StrUtil.COMMA),

    BRAZIL("br", "巴西", "R$", "BRL", StrUtil.DOT),

    ;

    /**
     * code
     */
    private final String code;

    /**
     * name
     */
    private final String name;

    /**
     * currency
     */
    private final String currency;

    /**
     * currency code
     */
    private final String currencyCode;

    /**
     * thousands separator
     */
    private final String thousandsSeparator;

    /**
     * get by currency code
     *
     * @param currencyCode currency code
     * @return {@link AreaEnum }
     */
    public static AreaEnum getByCurrencyCode(String currencyCode) {
        for (AreaEnum areaEnum : values()) {
            if (StrUtil.equals(areaEnum.getCurrencyCode(), currencyCode)) {
                return areaEnum;
            }
        }
        throw new BizException("area not found, currencyCode: {}", currencyCode);
    }

}
