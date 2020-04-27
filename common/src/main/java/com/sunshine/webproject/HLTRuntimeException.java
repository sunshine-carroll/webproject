package com.sunshine.webproject;

/**
 * @author: sunshine
 * @date: 2020/4/16 22:14
 * @description :
 */
public class HLTRuntimeException extends RuntimeException{
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/

    public HLTRuntimeException() {
    }

    public HLTRuntimeException(String message) {
        super(message);
    }

    public HLTRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HLTRuntimeException(Throwable cause) {
        super(cause);
    }

    public HLTRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
