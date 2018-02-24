package com.learn.springboot.cloud.ProducerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by vdokku on 2/23/2018.
 */


@SpringBootApplication
@PropertySource("classpath:/producerApp.properties")
public class ProducerAppDriver {

    public static void main(String[] args) {
        SpringApplication.run(ProducerAppDriver.class, args);

    }
}
