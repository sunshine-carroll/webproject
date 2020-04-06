package com.sunshine.webproject.concurrency.annotations;

import java.lang.annotation.*;

/**
 * <p>线程安全性注解</p>
 * 使用在类上时意图表示类是可变的，使用在成员变量上时意图表示这个变量是可变类的一个实例,此注解仅存在与源代码，具体更多细节可以参考
 * <a href="https://baike.baidu.com/item/Java并发编程实战/519217?fr=aladdin">《Java并发实战》</a>
 * @author sunshine
 * @date 2019-09-01 17:00:00
 * */
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Mutable {
}
