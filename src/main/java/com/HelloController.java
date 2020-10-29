package com;

import com.atguigu.HelloWorldMainApplication;
import org.springframework.boot.SpringApplication;
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
    /**
     * 将主程序放在定义HelloWorldMainApplication所在包的外面，springboot就无法找到这个程序体运行了
     * @return
     */
//    @ResponseBody
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello world !";
//    }
}
