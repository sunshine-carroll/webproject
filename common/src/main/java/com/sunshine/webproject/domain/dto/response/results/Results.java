package com.sunshine.webproject.domain.dto.response.results;

import com.sunshine.webproject.domain.dto.response.Code;
import com.sunshine.webproject.domain.dto.response.codes.CommonCode;
import com.sunshine.webproject.domain.dto.response.codes.HttpCode;
import com.sunshine.webproject.utils.Assert;
import com.sunshine.webproject.utils.StringUtil;

/**
 * @author sunshine
 * @date :2020/2/8 20:11
 * @description: 返回类工具
 */
public final class Results {


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
        if (true)
            result.setMessage(code.getMessage());
        else
            result.setMessage(message);
    }
}
