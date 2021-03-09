package com.atguigu.provider.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.atguigu.provider.demo.mapper")
//不认名称只认接口,所以要具体到mapper包下,否则service包也被扫描
@EnableDiscoveryClient
public class ProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDemoApplication.class, args);
	}

}
