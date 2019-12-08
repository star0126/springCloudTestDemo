package com.system.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: spring_cloud_demo
 * @since:JDK-1.8
 * @author: Star-GuoqingLi
 * @create: 2019-12-08 15:36
 * @version:第1版
 * @description:
 **/
@SpringBootApplication
@EnableEurekaServer //标注这是EurekaServer服务器端启动类，接受其他服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
