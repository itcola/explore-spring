package com.cola.controller;

import com.cola.annotation.*;
import com.cola.service.HelloService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: cola
 * Date: 2020/8/12 22:20
 * Description: DEMO
 */
@ColaController
@ColaRequestMapping("/cola")
public class HelloController {

    @ColaAutowired
    private HelloService helloService;

    @ColaRequestMapping("/hello")
    public void hello(HttpServletResponse response, @ColaRequestParam("name") String name){
        String result = helloService.hello(name);
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
