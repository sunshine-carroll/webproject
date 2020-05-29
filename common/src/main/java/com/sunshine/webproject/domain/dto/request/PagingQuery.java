package com.sunshine.webproject.domain.dto.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * 分页查询
 *
 * @author: sunshine
 * @date: 2020/5/28 17:43
 */
public class PagingQuery {

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    @ApiModelProperty(name = "page",value = "页面号",required = true,dataType="integer")
    private Integer page = 1;

    @ApiModelProperty(name = "page",value = "页面号",required = true,dataType="integer")
    private Integer pageSize = 10;
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
