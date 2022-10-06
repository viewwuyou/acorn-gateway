package com.viewwuyou.acorn.gateway.domain.config;

import com.viewwuyou.acorn.gateway.domain.Coordinate;
import com.viewwuyou.acorn.gateway.domain.DomainService;
import org.springframework.stereotype.Component;

/**
 * @author viewwuyou
 */
@Component
public class ConfigDomainService implements DomainService {
    @Override
    public String getDomainName() {
        return ConfigDomainService.class.getName();
    }

    @Override
    public String getImplCode() {
        return Coordinate.DEFAULT;
    }
}
