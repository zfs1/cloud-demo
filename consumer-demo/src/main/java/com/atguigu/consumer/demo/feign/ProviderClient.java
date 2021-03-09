package com.atguigu.consumer.demo.feign;

import com.atguigu.consumer.demo.feign.fallback.ProviderFallback;
import com.atguigu.consumer.demo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: zhou
 * @Date: 2021/3/8 8:52
 * @des:
 */
@FeignClient(value = "provider-service",fallback = ProviderFallback.class)
public interface ProviderClient {
    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id")long id) ;


}
