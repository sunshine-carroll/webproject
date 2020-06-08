package com.sunshine.webproject.domain.dto.response.enums;
/**
 * 业务码系列
 * @author sunshine
 * @date :2020/3/21 19:04
 */
public enum Series {
    /**
     * 公共返回码
     * @author sunshine
     * @date :2020/6/1 18:25
     */
    COMMON(1),
    /**
     * 权限返回码
     * @author sunshine
     * @date :2020/6/1 18:25
     */
    PERMISSION(2),
    /**
     * 数据库返回码
     * @author sunshine
     * @date :2020/6/1 18:25
     */
    DATABASE(6)
    ;
    private final int start;

    Series(int start) {
        this.start = start;
    }
}
