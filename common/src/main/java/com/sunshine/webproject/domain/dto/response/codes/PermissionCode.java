package com.sunshine.webproject.domain.dto.response.codes;

import com.sunshine.webproject.domain.dto.response.Code;

public enum PermissionCode implements Code {
    ;
    private final int code;
    private final String message;
    PermissionCode(int code,String message){
        this.code = code;
        this.message = message;
    }
    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
