package com.cogent.app;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig2 {
	
	// call swagger at http://localhost:9095/v2/api-docs and http://localhost:9095/swagger-ui.html#/
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cogent.api"))
                .paths(regex("/user.*"))
                .build()
                .apiInfo(metaData());
    }
	
	 private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "MovieTime - Spring Boot Application",
	                "REST API for User Details",
	                "1.0",
	                "Terms of service",
	                new Contact("Rohit Thadakapalli", "http://localhost:9095/v2/api-docs", "rohit.thadakapalli@gmail.com"),
	               "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	    }

}
