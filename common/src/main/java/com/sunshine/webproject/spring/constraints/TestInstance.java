package com.sunshine.webproject.spring.constraints;

import com.sunshine.webproject.spring.constraints.support.TestInstanceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 测试一下validator 实例个数
 *
 * 当项目启动时，validator 不会被实例化
 * validator 在调用一个需要验证的接口时 实例化。
 * 每一个验证注解都会实例化一个validator
 * @author sunshine
 * @date :2020/6/15 11:20
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {TestInstanceValidator.class})
public @interface TestInstance {
    /**
     * default error message
     *
     * @author sunshine
     * @date :2020/6/16 10:22
     */
    String message() default "sunshine carroll";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
