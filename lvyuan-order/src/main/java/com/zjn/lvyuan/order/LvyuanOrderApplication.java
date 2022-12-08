package com.zjn.lvyuan.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zjn.lvyuan.order.dao")
@SpringBootApplication
public class LvyuanOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvyuanOrderApplication.class, args);
	}

}
