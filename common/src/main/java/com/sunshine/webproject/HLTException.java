package com.sunshine.webproject;

/**
 * @author: sunshine
 * @date: 2020/4/16 22:13
 * @description : 本项目所有自定义非运行时异常的基类
 */
public class HLTException extends Exception{
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/

    public HLTException() {
    }

    public HLTException(String message) {
        super(message);
    }

    public HLTException(String message, Throwable cause) {
        super(message, cause);
    }

    public HLTException(Throwable cause) {
        super(cause);
    }

    public HLTException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
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
    |               M E T H O D S               |
    ============================================*/
}
