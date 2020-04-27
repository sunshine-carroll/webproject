package com.sunshine.webproject.exception.interfaces;

import com.sunshine.webproject.domain.dto.response.Code;

/**
 * @author sunshine
 * @date :2020/4/16 22:16
 * @description: 可报告对象
 */
public interface Reportable {
    /**
     * @author sunshine
     * @date :2020/4/16 22:16
     * @description:
     * @return Code
     */
    Code getCode();
}
