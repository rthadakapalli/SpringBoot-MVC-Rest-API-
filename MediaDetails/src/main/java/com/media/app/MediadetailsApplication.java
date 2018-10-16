package com.media.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.media")
@SpringBootConfiguration
@SpringBootApplication
public class MediadetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediadetailsApplication.class, args);
	}
}
