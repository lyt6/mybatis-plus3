package com.hello.mybatis.plus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hello.mybatis.plus.dto.UserDTO;
import com.hello.mybatis.plus.entity.User;
import com.hello.mybatis.plus.query.UserQuery;

public interface UserService extends IService<User> {

    IPage pageUser(Page page, UserQuery query);

    IPage pageUserXml(Page page,UserQuery query);

    User getUser(Long id);

    void addUser(UserDTO dto);

    void updateUserById(Long id, UserDTO dto);

    void delUser(Long id);
}
