package com.sunshine.webproject.enums;

/**
 * 这是一个日期格式的枚举类,标明了项目会用到的日期格式
 * 如
 * @author sunshine
 * @date 2019-09-01 16:53:00
 * */
public enum DateFormat {
    /**
     * 中式日期
     * */
    STANDARD_CHINESE_FORMAT("yyyy-MM-dd HH:mm:ss","2019-08-19 15:43:29"),
    /**
     * 美式日期
     * */
    STANDARD_AMERICAN_FORMAT("MM-dd-yyyy hh:mm:ss","08-19-2019 15:43:29"),
    /**
     * 英式日期
     * */
    STANDARD_ENGLISH_FORMAT("dd-MM-yyyy hh:mm:ss","19-08-2019 15:43:29")
    ;
    private final String format;
    private final String example;
    DateFormat(String format, String example){
        this.format = format;
        this.example = example;
    }

    @Override
    public String toString() {
        return "[Format:"+format+"]-[Example:"+example+"]";
    }
}
