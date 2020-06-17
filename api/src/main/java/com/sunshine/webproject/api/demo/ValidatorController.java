package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.spring.constraints.TestInstance;
import com.sunshine.webproject.entity.demo.IdQuery;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;

/**
 * validator demo
 *
 * @author: sunshine
 * @date: 2020/6/16 17:16
 */
@Api("validator-demo")
@RestController
@RequestMapping("validator")
@Validated
public class ValidatorController {
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
    
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    // javax.validation.constraints
    @PostMapping("positive")
    public Integer positive(@Positive(message = "需要正整数") @RequestParam Integer number){
        return number;
    }

    // custom validation
    @PostMapping("uuid")
    public String uuid(IdQuery query){
        return query.getId();
    }

    @PostMapping("testInstance")
    public String testInstance(@TestInstance String id){
        return id;
    }

    @PostMapping("testInstanceOne")
    public String testInstanceOne(@TestInstance(message = "ok") String id){
        return id;
    }

}
