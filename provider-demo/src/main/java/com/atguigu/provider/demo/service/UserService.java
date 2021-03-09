package com.atguigu.provider.demo.service;

import com.atguigu.provider.demo.mapper.UserMapper;
import com.atguigu.provider.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhou
 * @Date: 2021/3/7 14:18
 * @des:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(long id) {
        return  this.userMapper.selectById(id);

    }
}
