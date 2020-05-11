package com.sunshine.webproject.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author sunshine
 * @date :2020/3/23 21:49
 * @description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WebProjectConfigurationSelector.class)
public @interface EnableWebProject {
}
