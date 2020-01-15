package com.wyw.impl;

import com.wyw.dao.UserMapper;
import com.wyw.entity.User;
import com.wyw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: modules-demo
 * @description: UserImpl
 * @author: Mr.WYW
 * @create: 2020-01-15 18:
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> select() {
        return userMapper.select();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
