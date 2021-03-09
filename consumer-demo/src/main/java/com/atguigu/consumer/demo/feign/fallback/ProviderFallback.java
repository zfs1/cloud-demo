package com.atguigu.consumer.demo.feign.fallback;

import com.atguigu.consumer.demo.feign.ProviderClient;
import com.atguigu.consumer.demo.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author: zhou
 * @Date: 2021/3/9 0:19
 * @des:
 */
@Component
public class ProviderFallback implements ProviderClient {
    @Override
    public User queryUserById(long id) {
        return new User(null,"消费者熔断降级处理",88);
    }
}
