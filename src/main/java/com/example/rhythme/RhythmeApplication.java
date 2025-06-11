package com.example.rhythme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.rhythme.dao")
@SpringBootApplication
public class RhythmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhythmeApplication.class, args);
	}

}
