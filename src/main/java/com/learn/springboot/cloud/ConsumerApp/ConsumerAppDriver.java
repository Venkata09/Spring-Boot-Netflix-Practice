package com.learn.springboot.cloud.ConsumerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by vdokku on 2/23/2018.
 */


@SpringBootApplication
@PropertySource("classpath:/consumerapp.properties")
public class ConsumerAppDriver {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerAppDriver.class, args);

    }
}
