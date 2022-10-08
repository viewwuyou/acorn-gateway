package com.viewwuyou.acorn.gateway.test;

import com.alibaba.fastjson2.JSON;
import com.viewwuyou.acorn.gateway.inf.mapper.TestMapper;
import com.viewwuyou.acorn.gateway.inf.model.TestModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = {com.viewwuyou.acorn.gateway.start.Application.class})
@RunWith(SpringRunner.class)
public class InfTest {

    @Resource
    TestMapper testMapper;

    @Test
    public void test() {
        Long id = 2L;
        TestModel testModel = testMapper.selectById(id);
        System.out.println(JSON.toJSONString(testModel));
    }
}
