package com.sunshine.webproject.log;

/**
 * @author sunshine
 * @date :2020/3/23 21:42
 * @description: 对日志功能的简单封装。
 */
public class LoggerFactory {
    public static Logger getLogger(Class clazz){
        org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger(clazz);
        return new Slf4jLogger(slf4jLogger);
    }
}
