package com.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ankit")
public class HelloConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(HelloConfiguration.class, args);
    }
}
