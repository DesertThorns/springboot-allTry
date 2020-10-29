package com.atguigu;

/**
 * @Program: spring-boot-01-helloworld
 * @ClassName: HelloWorldMainApplication
 * @Description: TODD
 * @Author: Administrator
 * @Date: 2020/10/29
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序，说明这是一个spring boot应用
 * Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，
 * SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //让Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);

    }
}
