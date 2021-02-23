package com.hello.mybatisplus.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatisplus.MybatisPlusApplication;
import com.hello.mybatisplus.query.UserQuery;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest(classes = MybatisPlusApplication.class)
@DisplayName("mybatis-plus测试")
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testPageList(){
        Page page = userService.pageUser(new Page(1, 2), new UserQuery());
        long total = page.getTotal();
        long size = page.getSize();
        List records = page.getRecords();
        log.info("total:{} size:{} records:{}",total,size, JSONObject.toJSONString(records));
    }

}