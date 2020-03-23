package com.sunshine.webproject.log;

/**
 * @author: sunshine
 * @date: 2020/3/23 21:36
 * @description : slf4jLogger
 */
class Slf4jLogger implements Logger {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    private org.slf4j.Logger logger;
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/

    public Slf4jLogger(org.slf4j.Logger logger) {
        this.logger = logger;
    }

    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        logger.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        logger.trace(format,arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        trace(format,arg1,arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        trace(format,arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        trace(msg,t);
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        debug(format,arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        debug(format,arg1,arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        debug(format,arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        debug(msg,t);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        info(format,arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        info(format,arg1,arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        info(format,arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        info(msg,t);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        logger.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        logger.warn(format,arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        logger.warn(format,arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        logger.warn(format,arg1,arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        logger.warn(msg,t);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        logger.error(format,arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        logger.error(format,arg1,arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        error(format,arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        error(msg,t);
    }
}
