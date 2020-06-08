package com.sunshine.webproject.domain.dto.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.Collections;
import java.util.List;

/**
 * 多目标命令
 * <p>
 *
 * <p/>
 * @author: sunshine
 * @date: 2020/6/1 16:46
 */
public class BatchTargetCommand<T> {
    //TODO - JavaDoc methods

    

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
    @ApiModelProperty(name = "targets",value = "操作目标集",required = true)
    private List<T> targets = Collections.emptyList();

    @ApiModelProperty(name = "strategy",value = "批量操作策略 0:at least one success;1:all success")
    private Integer strategy;
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
