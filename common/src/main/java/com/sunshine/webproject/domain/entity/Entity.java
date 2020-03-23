package com.sunshine.webproject.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: sunshine
 * @date: 2020/3/19 14:23
 * @description :
 */
@ApiModel("实体")
public class Entity {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
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
