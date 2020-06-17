package com.sunshine.webproject.utils;

import java.util.Objects;

/**
 * @author: sunshine
 * @date: 2020/3/21 16:50
 * @description : 枚举工具类
 */
public final class EnumUtil {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/

    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |       S T A T I C M E T H O D S           |
    ============================================*/

    /**
     * @author sunshine
     * @date :2020/3/21 16:59
     * @param enumClazz a class with a generic parameter extend from Enum<E>
     * @param ordinal the ordinal of enum we need
     * @return a enum instance of enumClazz which the ordinal is the param "ordinal"
     * @throws IllegalArgumentException if enumClazz not instance of Enum<E>
     * @throws ArrayIndexOutOfBoundsException if ordinal is nonnegative Integer or ordinal ≥ size of specific declared enum
     */
    public static <T extends Enum> T getEnum(Class<T> enumClazz,int ordinal){
        if (!enumClazz.isEnum())
            throw  new IllegalArgumentException("enumClazz muse be Class of Enum,the illegal input is "+enumClazz.getSimpleName());
        return enumClazz.getEnumConstants()[ordinal];
    }



}
