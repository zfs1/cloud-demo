package com.atguigu.consumer.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhou
 * @Date: 2021/3/7 13:28
 * @des:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  Long id;
    private  String name;
    private  Integer age;
}
