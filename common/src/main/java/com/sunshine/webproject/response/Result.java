package com.sunshine.webproject.response;

import java.io.Serializable;

/**
 * 定义基本的返回类型具有的行为
 * @author sunshine
 * @date 2019-09-10
 * */
public abstract class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
