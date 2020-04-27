package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.spring.component.controller.BaseController;
import com.sunshine.webproject.demo.DemoService;
import com.sunshine.webproject.domain.dto.response.results.Results;
import com.sunshine.webproject.domain.dto.response.results.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Api("demo")
@RestController
@RequestMapping("demo")
public class DemoController extends BaseController {
    @Autowired
    DemoService baseService;

    @ApiOperation(value = "hello world",notes = "hello world",response = Result.class)
    @GetMapping("helloWorld")
    public Result helloWorld(){
        return Result.success();
    }

    @ApiOperation(value = "nullResult",notes = "当服务层接口为实现是返回错误信息",response = Result.class)
    @GetMapping("nullResult")
    public Result getNullResult(){
        return Optional.ofNullable(baseService.getNullResult()).orElseThrow(()->new NullPointerException((getMethodExceptionInfo("getNullResult"))));
    }

}
