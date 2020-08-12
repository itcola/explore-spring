package com.cola.annotation;

import java.lang.annotation.*;

/**
 * Author: cola
 * Date: 2020/8/11 8:08
 * Description: RequestParam
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ColaRequestParam {
    String value() default "";
}
