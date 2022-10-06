package com.viewwuyou.acorn.gateway.domain;

/**
 * @author viewwuyou
 */
public interface DomainService {

    /**
     * 获取领域服务名
     * @return 领域服务名
     */
    String getDomainName();

    /**
     * 获取实现的领域服务坐标
     * @return
     */
    String getImplCode();
}
