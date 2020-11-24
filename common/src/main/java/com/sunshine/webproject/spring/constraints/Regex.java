package com.sunshine.webproject.spring.constraints;

import com.sunshine.webproject.spring.constraints.support.RegexValidator;
import com.sunshine.webproject.spring.constraints.support.UUIDValidator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author sunshine
 * @date :2020/6/15 11:20
 * @see UUIDValidator
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {RegexValidator.class})
public @interface Regex {

    /**
     * @author sunshine
     * @date :2020/6/17 17:49
     */
    String regex();

    /**
     * @author sunshine
     * @date :2020/7/24 11:27
     */
    String message() default "not match regex";
}
