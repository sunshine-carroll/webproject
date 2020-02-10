package com.sunshine.webproject.response.results;

import com.sunshine.webproject.response.ResultWithData;

public class StandardResultWithData<T> extends SimpleResult implements ResultWithData<T> {
    private T data;
    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
