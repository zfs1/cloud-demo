package com.atguigu.consumer.demo.controller;

import com.atguigu.consumer.demo.feign.ProviderClient;
import com.atguigu.consumer.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhou
 * @Date: 2021/3/8 8:59
 * @des:
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("{id}")
    public User queryUserById (@PathVariable("id") long id, @RequestHeader("headername")String headername){
        System.out.println("headername = " + headername);
        return providerClient.queryUserById(id);
    }
}
