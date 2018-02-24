package com.learn.springboot.cloud.Zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableZuulProxy
@PropertySource("classpath:/zuul.properties")
public class ZuulGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayServiceApplication.class, args);
    }
}
