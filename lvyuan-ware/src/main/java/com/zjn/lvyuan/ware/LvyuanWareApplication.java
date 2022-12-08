package com.zjn.lvyuan.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zjn.lvyuan.ware.dao")
@SpringBootApplication
public class LvyuanWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvyuanWareApplication.class, args);
	}

}
