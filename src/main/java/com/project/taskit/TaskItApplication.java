package com.project.taskit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TaskItApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskItApplication.class, args);
    }

}
