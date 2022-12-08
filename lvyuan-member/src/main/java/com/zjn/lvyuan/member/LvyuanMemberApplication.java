package com.zjn.lvyuan.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author paopaochahu
 */
@MapperScan("com.zjn.lvyuan.member.dao")
@SpringBootApplication
public class LvyuanMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvyuanMemberApplication.class, args);
	}

}
