package com.sunshine.webproject.mvc;

/**
 * 用于添加公共的代码，不管是controller的还是Service的
 * @author: sunshine
 * @date: 2020/3/2 20:08
 */
public class BaseComponent {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    protected String getMethodExceptionInfo(String methodName){
        return "location:"+this.getClass().getName()+"#"+methodName;
    }

    protected String getMethodExceptionInfo(String methodName,String message){
        return this.getClass().getName()+"#"+methodName;
    }

    protected String getClassName(){
        return getClass().getName();
    }

    protected String getClassSimpleName(){
        return getClass().getSimpleName();
    }
}
