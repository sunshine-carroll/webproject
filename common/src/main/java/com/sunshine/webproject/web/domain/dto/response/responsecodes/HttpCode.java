package com.sunshine.webproject.web.domain.dto.response.responsecodes;

import com.sunshine.webproject.web.domain.dto.response.Code;

/**
 *Http协议中的状态码
 * <p>
 *     <li>1XX Informational(信息性状态码): 接受的请求正在处理</li>
 *     <li>2XX Success(成功状态码): 请求正常处理完毕</li>
 *     <li>3XX Redirection(重定向状态码): 需要附加操作以完成请求</li>
 *     <li>4XX Client Error(客户端错误状态码): 服务器无法处理请求</li>
 *     <li>5XX Server Error(服务端错误状态码): 服务器请求处理失败</li>
 * </p>
 * @author sunshine
 * @date 2019-10-31
 * */
public enum HttpCode implements Code {
    //成功
    OK(200,"OK"),
    //非认证信息
    NON_AUTHORITATIVE_INFORMATION(203,"NON_AUTHORITATIVE_INFORMATION"),
    NO_CONTENT(204,"NO CONTENT"),
    //部分资源
    PARTIAL_CONTENT(206,"PARTIAL CONTENT")
    ;
    private final int code;
    private final String Message;
    HttpCode(int code, String message) {
        this.code = code;
        Message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
