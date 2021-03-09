package com.atguigu.provider.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: zhou
 * @Date: 2021/3/7 13:28
 * @des:
 */
@Data
@TableName("user")
public class User {
    private  Long id;
    private  String name;
    private  Integer age;
}
