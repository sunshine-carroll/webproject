package com.sunshine.webproject.domain.dto.response.codes;

import com.sunshine.webproject.domain.dto.response.Code;

public enum  CommonCode implements Code {
    ERROR(1000,"失败"),
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
