package com.wyw.dao;


import com.wyw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: modules-demo
 * @description: UserMapper
 * @author: Mr.WYW
 * @create: 2020-01-15 17:
 */
@Repository
public interface UserMapper {

    void insert(User user);

    List<User> select();
}
