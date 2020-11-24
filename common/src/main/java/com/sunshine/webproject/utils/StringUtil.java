package com.sunshine.webproject.utils;

/**
 * @author: sunshine
 * @date: 2020/3/19 14:25
 * @description :字符串工具类
 */
public final class StringUtil {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    /**
     * @author sunshine
     * @date :2020/5/27 09:45
     * @description:
     * @return null or {@code s.trim()}
     */
    public static String nullSafeTrim(String s){
        return s == null?null:s.trim();
    }

    public static boolean isNotBlank(String s){
        return false;
    }
}
