package com.wyw.service;

import com.wyw.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: modules-demo
 * @description: UserService
 * @author: Mr.WYW
 * @create: 2020-01-15 18:
 */
@Service
public interface UserService {

    List<User> select();

    void insert(User user);
}
