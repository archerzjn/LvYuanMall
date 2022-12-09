package com.zjn.lvyuan.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author paopaochahu
 */
@MapperScan("com.zjn.lvyuan.member.dao")
@EnableFeignClients(basePackages = "com.zjn.lvyuan.member.feign")
@SpringBootApplication
public class LvyuanMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvyuanMemberApplication.class, args);
    }

}
