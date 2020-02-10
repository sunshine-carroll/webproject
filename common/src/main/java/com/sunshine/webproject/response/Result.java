package com.sunshine.webproject.response;

/**
 * 定义基本的返回类型具有的行为
 * @author sunshine
 * @date 2019-09-10
 * */
public interface Result {
    /**
     * @author sunshine
     * @date :2020/2/8 19:23
     * @description: 获取返回码
     */
    int getCode();
    /**
     * @author sunshine
     * @date :2020/2/8 19:23
     * @description: 设置返回码
     */
    void setCode(int code);
    /**
     * @author sunshine
     * @date :2020/2/8 19:23
     * @description: 获取原因短语
     */
    String getMessage();

    /**
     * @author sunshine
     * @date :2020/2/8 19:23
     * @description: 设置原因短语
     */
    void setMessage(String msg);
}
