package com.sunshine.webproject.domain.dto.response.results;

import io.swagger.annotations.ApiModel;

@ApiModel("携带数据信息的返回结果")
public class DataResult<T> extends Result {

    public DataResult(){}

    public DataResult(T data){
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
