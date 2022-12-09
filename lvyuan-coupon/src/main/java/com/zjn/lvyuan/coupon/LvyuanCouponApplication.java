package com.zjn.lvyuan.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zjn.lvyuan.coupon.dao")
@SpringBootApplication
public class LvyuanCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvyuanCouponApplication.class, args);
	}

}
