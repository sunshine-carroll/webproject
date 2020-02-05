package com.sunshine.webproject.enums;
/**
 *常用的正则表达式
 * @author sunshine
 * @date 2019-09-12
 * */
public enum Regex {
    ID_CARD("","验证身份证格式的正则表达式"),
    PHONE("","验证手机号格式的正则表达式"),
    ;
    private final String regex;
    private final String description;

    Regex(String regex, String description) {
        this.regex = regex;
        this.description = description;
    }
}
