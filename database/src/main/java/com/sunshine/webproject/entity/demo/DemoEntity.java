package com.sunshine.webproject.entity.demo;

import com.sunshine.webproject.web.domain.entity.Entity;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * @author: sunshine
 * @date: 2020/3/19 14:22
 * @description :
 */
public class DemoEntity extends Entity {
    //TODO - JavaDoc methods

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    @ApiModelProperty(name = "name",value = "名称")
    private String name;
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    public static DemoEntity of(String name){
        DemoEntity entity = new DemoEntity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName(Objects.requireNonNull(name));
        return entity;
    }
}
