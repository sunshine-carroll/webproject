package com.sunshine.webproject.domain.dto.response.codes;

import com.sunshine.webproject.domain.dto.response.Code;

/**
 * 通用数据库操作码，不建议暴露过于详细的信息
 * 开发时可以暴露详细信息，用户快速定位错误，加快开发效率
 * 上线时，可以把getMessage() 返回 "错误，请联系管理员" 等字样，避免暴露操作细节
 * 6XXX表示数据库码
 *在此前提下
 * 6100 表示默认的数据库异常
 * 62XX 表示插入异常 即 增
 * 63XX 表示删除异常 即 删
 * 64XX 表示更新异常 即 改
 * 65XX 表示查询异常 即 查
 * XX00 代表XX异常类型下的默认异常
 * @author sunshine
 * */
public enum DatabaseCode implements Code {
    DEFAULT_CODE(6100,"数据库异常"),
    INSERT_ERROR(6200,"插入数据异常"),
    DELETE_ERROR(6300,"删除数据异常"),
    UPDATE_ERROR(6400,"更新数据异常"),
    SELECT_ERROR(6500,"查询数据异常"),
    ;
    private final int code;
    private final String message;

    DatabaseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}