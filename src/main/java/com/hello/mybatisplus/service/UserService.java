package com.hello.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hello.mybatisplus.dto.UserDTO;
import com.hello.mybatisplus.entity.User;
import com.hello.mybatisplus.query.UserQuery;

public interface UserService extends IService<User> {

    IPage pageUser(Page page, UserQuery query);

    IPage pageUserXml(Page page,UserQuery query);

    User getUser(Long id);

    void addUser(UserDTO dto);

    void updateUserById(Long id, UserDTO dto);

    void delUser(Long id);
}
