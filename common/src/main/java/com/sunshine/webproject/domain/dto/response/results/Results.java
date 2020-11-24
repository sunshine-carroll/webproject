package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.Code;
import com.sunshine.webproject.domain.dto.response.codes.CommonCode;
import com.sunshine.webproject.domain.dto.response.codes.HttpCode;
import com.sunshine.webproject.utils.Assert;
import com.sunshine.webproject.utils.StringUtil;

import java.util.Collections;
import java.util.function.Function;

/**
 * @author sunshine
 * @date :2020/2/8 20:11
 * @description: 返回类工具
 */
public final class Results {

    //初始化常见返回值
    private static final Result SUCCESS = generateBasicResult(HttpCode.OK);

    private static final Result UNDEFINED_ERROR = generateBasicResult(CommonCode.UNDEFINED);


    public static Result success(){
        return SUCCESS;
    }

    public static Result success(String message){
        Result result = new Result();
        useCode(result,HttpCode.OK,message);
        return result;
    }

    public static Result fail(){
        return UNDEFINED_ERROR;
    }

    public static Result fail(String message){
        return fail(CommonCode.UNDEFINED,message);
    }

    public static Result fail(Code code,String message){
        Result result = new Result();
        useCode(result,code,message);
        return result;
    }


    private static Result generateBasicResult(Code code){
        Result result = new Result();
        useCode(result,code);
        return unModifiableResult(result,UnModifiableResult::new);
    }
    /**
     * @author sunshine
     * @date :2020/7/8 20:43
     */
    public static  <T extends Result> T unModifiableResult(T t, Function<T,T> function){
        return function.apply(t);
    }
    //result 级别
    /**
     * @author sunshine
     * @date :2020/4/16 21:41
     * @description:
     * @param result
     * @param code
     */
     static <T extends Result> void useCode(T result,Code code){
         result.setCode(code.getCode());
         result.setMessage(code.getMessage());
     }
    /**
     * @author sunshine
     * @date :2020/4/16 21:41
     * @description:
     * @param result
     * @param code
     */
    static <T extends Result> void useCode(T result,Code code,String message){
        result.setCode(code.getCode());
        if (StringUtil.isNotBlank(message))
            result.setMessage(message);
        else
            result.setMessage(code.getMessage());
    }

    private static class UnModifiableResult extends Result{

        UnModifiableResult(Result result) {
            Assert.notNull(result,"parameter of construct UnModifiableResult(Result result ) can not be null");
            super.code = result.getCode();
            super.message = result.getMessage();
        }


        @Override
        public void setCode(int code) {
            throw new UnsupportedOperationException();
        }


        @Override
        public void setMessage(String message) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void initCode(Code code) {
            throw new UnsupportedOperationException();
        }
    }
}
