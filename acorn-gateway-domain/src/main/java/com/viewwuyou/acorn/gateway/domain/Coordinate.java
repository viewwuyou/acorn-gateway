package com.viewwuyou.acorn.gateway.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author viewwuyou
 * 领域坐标
 */
@Data
@AllArgsConstructor
public class Coordinate {

    public static final String DEFAULT = "default";

    /**
     * 领域服务code
     */
    private String code;
    /**
     * 对应的服务code
     */
    private String implCode;
}
