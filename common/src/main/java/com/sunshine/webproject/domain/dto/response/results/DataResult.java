package com.sunshine.webproject.domain.dto.response.results;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("携带数据信息的返回结果")
public class DataResult<T> extends Result {

    public DataResult(){}

    public DataResult(T data){
        this.data = data;
    }

    @ApiModelProperty(name = "data",value = "数据")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
