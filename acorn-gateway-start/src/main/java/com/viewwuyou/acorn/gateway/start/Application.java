package com.viewwuyou.acorn.gateway.start;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author viewwuyou
 */
@SpringBootApplication(scanBasePackages = "com.viewwuyou.acorn.gateway")
@MapperScan(basePackages = {"com.viewwuyou.acorn.gateway.inf.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
