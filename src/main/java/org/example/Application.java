package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example"})
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("Starting Application...");
        SpringApplication.run(Application.class, args);
    }
}
