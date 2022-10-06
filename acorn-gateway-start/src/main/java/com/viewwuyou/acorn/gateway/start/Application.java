package com.viewwuyou.acorn.gateway.start;

import com.viewwuyou.acorn.gateway.domain.DomainServiceCenter;
import com.viewwuyou.acorn.gateway.domain.config.ConfigDomainService;
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
        DomainServiceCenter domainServiceCenter = applicationContext.getBean(DomainServiceCenter.class);
        ConfigDomainService configDomainService = domainServiceCenter.getDomainService(ConfigDomainService.class);
        if (configDomainService != null) {
            System.out.println(configDomainService.getDomainName() + " " + configDomainService.getImplCode());
        }
    }
}
