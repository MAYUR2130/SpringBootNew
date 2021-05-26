package com.aws.controller;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public SwaggerConfig() {

	}
	

	@Bean
	public Docket api() {
		
		//return API Docket
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.aws.controller")).paths(PathSelectors.any())
				.build().apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
	    
		// API Info
		return new ApiInfo(
	            "Title:AWS Demo project",
	            "Spring Boot REST API for Online Store ",
	            "Version 1.3",
	            "ToURL:",
	            new Contact("Contact:Admin","ContactURL:","ContactEmail"),
	            "LICENSE",
	            "LicenseURL:", new ArrayList<>());
	}
}


