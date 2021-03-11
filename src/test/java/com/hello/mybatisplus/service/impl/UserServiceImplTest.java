package com.hello.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatisplus.MybatisPlusApplication;
import com.hello.mybatisplus.query.UserQuery;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@SpringBootTest(classes = MybatisPlusApplication.class)
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testPageList(){
        IPage page = userService.pageUser(new Page(1, 2), new UserQuery());
        assertTrue(page.getRecords().size() > 0);
    }

}