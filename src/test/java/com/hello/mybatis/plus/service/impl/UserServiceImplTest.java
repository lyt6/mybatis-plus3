package com.hello.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatis.plus.MybatisPlusApplication;
import com.hello.mybatis.plus.query.UserQuery;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = MybatisPlusApplication.class)
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 分页
     */
    @Test
    public void testPage(){
        userService.pageUser(new Page(1, 2), new UserQuery());
    }

    /**
     * 全表删除
     */
    @Test
    public void testDeleteAll() {
        userService.remove(null);
    }

}