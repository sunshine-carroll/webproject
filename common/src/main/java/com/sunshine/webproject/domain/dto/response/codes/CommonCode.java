package com.sunshine.webproject.domain.dto.response.codes;

import com.sunshine.webproject.domain.dto.response.Code;

public enum  CommonCode implements Code {
    /**
     * 表示发生一个未知或者未定义的错误
     * @author sunshine
     * @date :2020/6/1 18:09
     **/
    UNDEFINED(1000,"未定义的错误"),
    ;
    private final int code;
    private final String Message;
    CommonCode(int code, String message) {
        this.code = code;
        Message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
