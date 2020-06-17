package com.sunshine.webproject.entity.demo;

import com.sunshine.webproject.spring.constraints.RequireUUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: sunshine
 * @date: 2020/6/17 10:39
 */
@ApiModel
public class IdQuery {
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
    @RequireUUID(message = "需要 time-based uuid",version = 1)
    @ApiModelProperty(name = "id",value = "id",dataType = "String")
    private String id;
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
