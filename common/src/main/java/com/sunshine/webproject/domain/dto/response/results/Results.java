package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.Code;
import com.sunshine.webproject.domain.dto.response.codes.CommonCode;
import com.sunshine.webproject.domain.dto.response.codes.HttpCode;

/**
 * @author sunshine
 * @date :2020/2/8 20:11
 * @description: 返回类工具
 */
public final class Results {

    public static Result success(){
        return Result.getResult(HttpCode.OK);
    }

    public static <T> DataResult successWithData(T data){
        DataResult<T> dataResult = new DataResult<>(data);
        dataResult.initCode(HttpCode.OK);
        return dataResult;
    }



    public static Result successWithCustomMessage(String message){
        return Result.getResultWithCustomMessage(HttpCode.OK,message);
    }

    public static Result failure(){
        return Result.getResult(CommonCode.UNDEFINED);
    }

    public static Result failure(Code code){
        return Result.getResult(code);
    }

    public static boolean isSuccess(Result result){
        return result.getCode() == 200;
    }
}
