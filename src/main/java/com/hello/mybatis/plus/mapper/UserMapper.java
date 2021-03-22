package com.hello.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.mybatis.plus.query.UserQuery;
import com.hello.mybatis.plus.entity.User;

public interface UserMapper extends BaseMapper<User> {

    IPage<User> pageUserXml(Page page, UserQuery query);

}
