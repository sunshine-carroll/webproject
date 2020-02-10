package com.sunshine.webproject.response.results;

import com.sunshine.webproject.response.Code;
import com.sunshine.webproject.response.Result;

/**
 * @author sunshine
 * @date :2020/2/8 20:55
 * @description: 简单的只包含code,message的返回结果
 */
class SimpleResult implements Result {

    public static Result getResult(Code code){
        SimpleResult simpleResult = new SimpleResult();
        simpleResult.setCode(code.getCode());
        simpleResult.setMessage(code.getMessage());
        return new SimpleResult();
    }

    public static Result getResult(Code code,String message){
        SimpleResult simpleResult = new SimpleResult();
        simpleResult.setCode(code.getCode());
        simpleResult.setMessage(code.getMessage());
        return new SimpleResult();
    }

    private int code;
    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
