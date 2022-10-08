package com.viewwuyou.acorn.gateway.start;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author viewwuyou
 */
@SpringBootApplication(scanBasePackages = "com.viewwuyou.acorn.gateway")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(DruidStatManagerFacade.getInstance().getDataSourceStatDataList());
    }
}
