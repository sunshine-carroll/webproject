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
    String message() default "fail to meet UUID condition";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
