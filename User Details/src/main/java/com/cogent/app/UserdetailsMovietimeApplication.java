package com.cogent.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan({"com.cogent.mapper", "com.media.mapper"})
@ComponentScan(basePackages = {"com.cogent", "com.media", "com.media.service"})
@SpringBootConfiguration
@SpringBootApplication
public class UserdetailsMovietimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdetailsMovietimeApplication.class, args);
	}
}
