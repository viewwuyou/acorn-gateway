package com.viewwuyou.acorn.gateway.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author viewwuyou
 */
@SpringBootApplication(scanBasePackages = "com.viewwuyou.acorn.gateway")
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }
}
