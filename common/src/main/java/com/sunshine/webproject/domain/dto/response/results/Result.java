package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author sunshine
 * @date :2020/2/8 20:55
 * @description: 简单的只包含code,message的返回结果
 */
@ApiModel(description = "只有状态码和原因短语的返回类")
public class Result {

    public static Result getResult(Code code){
        Result result = new Result();
        result.setCode(code.getCode());
        result.setMessage(code.getMessage());
        return new Result();
    }

    public static Result getResultWithCustomMessage(Code code, String message){
        Result result = new Result();
        result.setCode(code.getCode());
        result.setMessage(code.getMessage());
        return new Result();
    }

    @ApiModelProperty(name = "code",value = "状态码",dataType = "number")
    private int code;
    @ApiModelProperty(name = "message",value = "状态码的一个简要描述",dataType = "String")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void initCode(Code code){
        this.code = code.getCode();
        this.message = code.getMessage();
    }
}
