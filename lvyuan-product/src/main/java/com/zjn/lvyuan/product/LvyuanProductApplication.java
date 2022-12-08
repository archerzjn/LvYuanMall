package com.zjn.lvyuan.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zjn.lvyuan.product.dao")
@SpringBootApplication
public class LvyuanProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvyuanProductApplication.class, args);
    }

}
