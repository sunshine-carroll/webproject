package com.sunshine.webproject.spring.constraints;

import com.sunshine.webproject.spring.constraints.support.UUIDValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author sunshine
 * @date :2020/6/15 11:20
 * @see UUIDValidator
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {UUIDValidator.class})
public @interface UUID {

    /**
     * default error message
     *
     * @author sunshine
     * @date :2020/6/16 10:22
     */
    String message() default "fail to meet UUID condition";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * when version == -1 it will not  check the version of UUID
     * @author sunshine
     * @date :2020/6/16 17:19
     */
    int version() default -1;
}
