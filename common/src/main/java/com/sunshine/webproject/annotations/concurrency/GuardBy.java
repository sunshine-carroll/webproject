package com.sunshine.webproject.annotations.concurrency;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>线程安全性注解</p>
 * 表明一段代码的现场安全性由什么保证,此注解仅存在与源代码，具体更多细节可以参考
 * <a href="https://baike.baidu.com/item/Java并发编程实战/519217?fr=aladdin">《Java并发实战》</a>
 * 使用线程封闭策略的可以忽略此注解
 * @author sunshine
 * @date 2019-09-01 17:00:00
 * */
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface GuardBy {
    String description() default "";
}
