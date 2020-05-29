package com.sunshine.webproject.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * The {@link com.sunshine.webproject.event.EventListener} is meta-annotated with
 * {@link org.springframework.context.event.EventListener} 代码不直接依赖Spring事件，
 * 变更事件实现机制后，不需要变更使用{@link com.sunshine.webproject.event.EventListener}的代码
 * 可以自己扩展注解属性，使用IoC容器扩展功能实现注解的语义
 * @author: sunshine
 * @date: 2020/5/7 18:16
 * @see org.springframework.context.event.EventListener
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@org.springframework.context.event.EventListener
public @interface EventListener {
    /**
     * Alias for {@link #classes}.
     */
    @AliasFor(value = "classes",annotation = org.springframework.context.event.EventListener.class)
    Class<?>[] value() default {};

    /**
     * The event classes that this listener handles.
     * <p>If this attribute is specified with a single value, the
     * annotated method may optionally accept a single parameter.
     * However, if this attribute is specified with multiple values,
     * the annotated method must <em>not</em> declare any parameters.
     */
    @AliasFor(value="value",annotation = org.springframework.context.event.EventListener.class)
    Class<?>[] classes() default {};

    /**
     * Spring Expression Language (SpEL) attribute used for making the
     * event handling conditional.
     * <p>Default is {@code ""}, meaning the event is always handled.
     * <p>The SpEL expression evaluates against a dedicated context that
     * provides the following meta-data:
     * <ul>
     * <li>{@code #root.event}, {@code #root.args} for
     * references to the {@link ApplicationEvent} and method arguments
     * respectively.</li>
     * <li>Method arguments can be accessed by index. For instance the
     * first argument can be accessed via {@code #root.args[0]}, {@code #p0}
     * or {@code #a0}. Arguments can also be accessed by name if that
     * information is available.</li>
     * </ul>
     */
    @AliasFor(value="condition",annotation = org.springframework.context.event.EventListener.class)
    String condition() default "";
}
