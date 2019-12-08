package com.system.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring_cloud_demo
 * @since:JDK-1.8
 * @author: Star-GuoqingLi
 * @create: 2019-12-08 14:33
 * @version:第1版
 * @description:
 **/
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
