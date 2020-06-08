package com.sunshine.webproject.domain.dto.request.support;

import io.swagger.annotations.ApiModelProperty;

/**
 * 排序
 *
 * @author: sunshine
 * @date: 2020/6/1 14:10
 */
public class Order {
    //TODO - JavaDoc methods

    

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    @ApiModelProperty(name = "field",value = "要排序的字段",required = true,dataType="String")
    private String field;

    @ApiModelProperty(name = "order",value = "排序方式:desc,asc",required = false,dataType="String")
    private String order;
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
