package com.viewwuyou.acorn.gateway.inf.mapper;

import com.viewwuyou.acorn.gateway.inf.model.TestModel;

/**
 * @author viewwuyou
 */
public interface TestMapper {
    TestModel selectById(Long id);
}
