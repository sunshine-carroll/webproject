package com.sunshine.webproject.response.results;

import com.sunshine.webproject.response.Code;
import com.sunshine.webproject.response.Result;
import com.sunshine.webproject.response.responsecodes.CommonCode;
import com.sunshine.webproject.response.responsecodes.HttpCode;

/**
 * @author sunshine
 * @date :2020/2/8 20:11
 * @description: 返回类工具
 */
public final class ResultUtils {

    public static Result success(){
        return SimpleResult.getResult(HttpCode.OK);
    }

    public static Result success(Code code){
        return SimpleResult.getResult(code);
    }

    public static Result failure(){
        return SimpleResult.getResult(CommonCode.ERROR);
    }

    public static Result failure(Code code){
        return SimpleResult.getResult(HttpCode.OK);
    }

    public static boolean isSuccess(Result result){
        return result.getCode() == 200;
    }
}
