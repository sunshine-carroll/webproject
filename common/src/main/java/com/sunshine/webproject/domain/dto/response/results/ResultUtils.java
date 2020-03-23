package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.Code;
import com.sunshine.webproject.domain.dto.response.codes.CommonCode;
import com.sunshine.webproject.domain.dto.response.codes.HttpCode;

/**
 * @author sunshine
 * @date :2020/2/8 20:11
 * @description: 返回类工具
 */
public final class ResultUtils {

    public static ResultBase success(){
        return ResultBase.getResult(HttpCode.OK);
    }

    public static <T> DataResult successWithData(T data){
        DataResult<T> dataResult = new DataResult<>(data);
        dataResult.initCode(HttpCode.OK);
        return dataResult;
    }



    public static ResultBase successWithCustomMessage(String message){
        return ResultBase.getResultWithCustomMessage(HttpCode.OK,message);
    }

    public static ResultBase failure(){
        return ResultBase.getResult(CommonCode.ERROR);
    }

    public static ResultBase failure(Code code){
        return ResultBase.getResult(HttpCode.OK);
    }

    public static boolean isSuccess(ResultBase result){
        return result.getCode() == 200;
    }
}
