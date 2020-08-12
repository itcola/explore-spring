package com.cola.service.impl;

import com.cola.annotation.ColaService;
import com.cola.service.HelloService;

/**
 * Author: cola
 * Date: 2020/8/12 22:21
 * Description: DEMO
 */
@ColaService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name){
        return "Hello " + name;
    }
}
