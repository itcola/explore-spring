package com.cola.annotation;

import java.lang.annotation.*;

/**
 * Author: cola
 * Date: 2020/8/11 7:56
 * Description: Autowired
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColaAutowired {
    String value() default "";
}
