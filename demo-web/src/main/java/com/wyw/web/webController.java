package com.wyw.web;

import com.wyw.entity.User;
import com.wyw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: modules-demo
 * @description: webController
 * @author: Mr.WYW
 * @create: 2020-01-15 17:
 */
@RestController
public class webController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String test(){
        return "yes!";
    }

    @GetMapping("/select")
    public List<User> select(){
        return userService.select();
    }

    @GetMapping("/insert")
    public void insert(){
        User user = new User();
        user.setUserId("111");
        user.setUserName("222");
        user.setUserPhone("333");
        userService.insert(user);
    }
}
