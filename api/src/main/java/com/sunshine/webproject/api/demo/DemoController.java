package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.response.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    public Result helloWorld(){
        return null;
    }
}
