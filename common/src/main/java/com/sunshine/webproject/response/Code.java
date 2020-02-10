package com.sunshine.webproject.response;

/**
 * <p>An interface define status code</p>
 * <p>
 *     定义Code类型的基本行为
 *     可参考Thinking in Java 4 19.7 使用接口组织枚举
 *     或 Effective java 3 第38条 使用接口模拟可扩展的枚举
 *     以理解和使用
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
    public enum DataBaseCode implements Code{
        DEFAULT_CODE(6100,"数据库异常"),
        INSERT_ERROR(6200,"插入数据异常"),
        DELETE_ERROR(6300,"删除数据异常"),
        UPDATE_ERROR(6400,"更新数据异常"),
        SELECT_ERROR(6500,"查询数据异常"),
        ;
        private final int code;
        private final String message;

        DataBaseCode(int code, String message) {
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
}
