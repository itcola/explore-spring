package com.cola.annotation;

import java.lang.annotation.*;

/**
 * Author: cola
 * Date: 2020/8/11 7:56
 * Description: Service
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColaService {
    String value() default "";
}
