package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: spring-boot-01-helloworld
 * @ClassName: HelloController
 * @Description: TODD
 * @Author: Administrator
 * @Date: 2020/10/29
 **/
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world !";
    }
}
