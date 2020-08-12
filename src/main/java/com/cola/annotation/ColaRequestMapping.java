package com.cola.annotation;

import java.lang.annotation.*;

/**
 * Author: cola
 * Date: 2020/8/11 8:04
 * Description: RequestMapping
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColaRequestMapping {
    String value() default "";
}
