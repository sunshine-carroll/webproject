package com.sunshine.webproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    /**
     * @Author sunshine
     * @Description
     * @Date 9:35 2019/5/7
     **/
    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("所有接口")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage("com.sunshine.webproject.api")) // 拦截的包路径
//                .paths(PathSelectors.regex("/user/.*"))// 拦截的接口路径
                .paths(PathSelectors.any())  //拦截所有接口
                .build() // 创建
                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo()); // 配置说明
    }
    /**
     * @author sunshine
     * @date :2020/2/10 16:15
     * @description: sunshine
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("webProject项目接口文档")// 标题
                .description("webProject项目描述")// 描述
                .contact(new Contact("sunshine", "https://sunshine-carroll.github.io","1959205721@qq.com"))// 联系
                .version("1.0-snapshot")// 版本
                .build();
    }

    private List<ApiKey> securitySchemes() {
        List<ApiKey> apiKeyList= new ArrayList();
//        apiKeyList.add(new ApiKey("x-auth-token", "x-auth-token", "header"));
        apiKeyList.add(new ApiKey("token", "token", "header"));
        return apiKeyList;
    }

}
