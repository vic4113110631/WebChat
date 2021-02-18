package com.william.services.impl;

import com.william.mapper.UserMapper;
import com.william.pojo.User;
import com.william.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    // 注入Mapper
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User queryUserNameIsExist(String username) {
        User user =  userMapper.queryUserNameIsExist(username);
        return user;
    }

}
