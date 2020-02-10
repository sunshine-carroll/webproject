package com.sunshine.webproject.response;

/**
 * @author sunshine
 * @date :2020/2/8 20:14
 * @description: 携带数据的返回结果
 */
public interface ResultWithData<T> extends Result {
    /**
     * @author sunshine
     * @date :2020/2/8 20:15
     * @description: 获取数据
     */
    T getData();

    /**
     * @author sunshine
     * @date :2020/2/8 20:15
     * @description: 设置数据
     */
    void setData(T t);
}
