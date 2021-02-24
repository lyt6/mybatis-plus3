package com.hello.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hello.mybatisplus.dto.UserDTO;
import com.hello.mybatisplus.entity.User;
import com.hello.mybatisplus.mapper.UserMapper;
import com.hello.mybatisplus.query.UserQuery;
import com.hello.mybatisplus.service.UserService;
import com.hello.mybatisplus.vo.UserVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Override
    public IPage pageUser(Page page, UserQuery query) {
        //分页
        page(page,new LambdaQueryWrapper<User>()
                .likeRight(StringUtils.isNotBlank(query.getName()),User::getName,query.getName())
                .eq(StringUtils.isNotBlank(query.getEmail()),User::getEmail,query.getEmail()));
        //转换vo
        page.convert(e -> {
            UserVO vo = new UserVO();
            BeanUtils.copyProperties(e,vo);
            return vo;
        });
        return page;
    }

    @Override
    public IPage pageUserXml(Page page, UserQuery query) {
        return baseMapper.pageUserXml(page,query);
    }

    @Override
    public User getUser(Long id) {
        return getById(id);
    }

    @Override
    public void addUser(UserDTO dto) {
        User user = new User();
        BeanUtils.copyProperties(dto,user);
        save(user);
    }

    @Override
    public void updateUserById(Long id, UserDTO dto) {
        User user = new User();
        BeanUtils.copyProperties(dto,user);
        user.setId(id);
        updateById(user);
    }

    @Override
    public void delUser(Long id) {
        removeById(id);
    }

}
