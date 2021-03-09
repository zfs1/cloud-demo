package com.atguigu.provider.demo.controller;

import com.atguigu.provider.demo.pojo.User;
import com.atguigu.provider.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhou
 * @Date: 2021/3/7 14:22
 * @des:
 */
@RestController
@RequestMapping("user")
@RefreshScope
//动态更新配置中心的配置。不用重启
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${myName}")
    private  String myName;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")long id) {
        User user= this.userService.queryUserById(id);
//        int i =1/0;
        user.setName(myName);
        return user;
    }
}
