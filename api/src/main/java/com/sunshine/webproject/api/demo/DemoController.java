package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.response.results.ResultUtils;
import com.sunshine.webproject.response.results.ResultBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("demo")
@RestController
@RequestMapping("demo")
public class DemoController {
    @ApiOperation(value = "hello world",notes = "hello world",response = ResultBase.class)
    @GetMapping("helloWorld")
    public ResultBase helloWorld(){
        return ResultUtils.success();
    }
}
