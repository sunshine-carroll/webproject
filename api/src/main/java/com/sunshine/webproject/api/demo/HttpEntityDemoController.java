package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.entity.demo.DemoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: sunshine
 * @date: 2020/3/19 14:08
 * @description : 关于httpEntity及其子类的使用
 */
@RequestMapping("httpEntityDemoController")
@RestController
@Api
public class HttpEntityDemoController {
    //TODO - JavaDoc methods


    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    @ApiOperation(value ="ResponseEntity的使用demo" ,notes = "return Sting")
    @PostMapping("demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Hello World");
    }

    @ApiOperation(value ="ResponseEntity返回实体" ,notes = "return an Entity")
    @PostMapping("returnEntityDemo")
    public ResponseEntity<DemoEntity> returnEntityDemo(){
        return ResponseEntity.ok(DemoEntity.of("sunshine"));
    }
}
