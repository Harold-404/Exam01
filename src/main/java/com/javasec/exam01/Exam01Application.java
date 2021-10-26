package com.javasec.exam01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // 暂时停用SpringBoot Security
public class Exam01Application {

    public static void main(String[] args) {
        SpringApplication.run(Exam01Application.class, args);
    }

}
