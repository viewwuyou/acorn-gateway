package com.viewwuyou.acorn.gateway.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author viewwuyou
 */
@Component
public class DomainServiceCenter implements ApplicationContextAware, InitializingBean {

    /**
     * 领域服务存储MAP
     */
    private static final ConcurrentHashMap<Coordinate, DomainService> DOMAIN_SERVICE_MAP = new ConcurrentHashMap<>();

    private ApplicationContext applicationContext;

    private void register(DomainService domainService) {
        DOMAIN_SERVICE_MAP.putIfAbsent(new Coordinate(domainService.getDomainName(), domainService.getImplCode()), domainService);
    }

    public <T extends DomainService> T getDomainService(Class<T> domainServiceClass) {
        return getDomainService(domainServiceClass, Coordinate.DEFAULT);
    }

    @SuppressWarnings("unchecked")
    public <T extends DomainService> T getDomainService(Class<T> domainServiceClass, String implCode) {
        return (T)DOMAIN_SERVICE_MAP.getOrDefault(new Coordinate(domainServiceClass.getName(), implCode), null);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, DomainService> beanMap = applicationContext.getBeansOfType(DomainService.class);
        beanMap.forEach((x, y) -> {
            register(y);
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
