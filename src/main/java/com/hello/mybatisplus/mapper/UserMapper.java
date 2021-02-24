package com.hello.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatisplus.entity.User;
import com.hello.mybatisplus.query.UserQuery;

public interface UserMapper extends BaseMapper<User> {

    IPage<User> pageUserXml(Page page, UserQuery query);

}
