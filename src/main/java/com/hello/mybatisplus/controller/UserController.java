package com.hello.mybatisplus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatisplus.entity.User;
import com.hello.mybatisplus.query.UserQuery;
import com.hello.mybatisplus.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户信息")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation(value = "分页查询",httpMethod = "GET",notes = "分页查询")
    public Page pageUser(Long page, Long size, UserQuery query){
        return userService.pageUser(new Page(page,size),query);
    }

    @ResponseBody
    @GetMapping("/{id}")
    @ApiOperation(value = "id查询",httpMethod = "GET",notes = "id查询")
    public User pageUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

}
