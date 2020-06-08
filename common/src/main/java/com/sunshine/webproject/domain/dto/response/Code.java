package com.sunshine.webproject.domain.dto.response;

/**
 * <p>An interface define status code</p>
 * <p>
 *     定义Code类型的基本行为
 *     可参考Thinking in Java 4 19.7 使用接口组织枚举
 *     或 Effective java 3 第38条
 * </p>
 * <p>
 *     建议
 *     <ul>
 *         <li>一个模块,或者一组功能，一个枚举类</li>
 *         <li>一个模块的选择特定的人维护一种状态码类型</li>
 *     </ul>
 * </p>
 * @author sunshine
 * @date 2019-09-10
 * */
public interface Code {
    /**
     * <p>获取状态码</p>
     * @author sunshine
     * @return  code
     * */
    int getCode();
    /**
     * <p>原因短语</p>
     * @return 关于code的简要描述
     * */
    String getMessage();

}
