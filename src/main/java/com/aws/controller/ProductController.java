package com.aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Value;
@RestController
public class ProductController {
	
	//@Autowired
	//private Environment environment;
	String key="${keyvalue}";
	
	
        @Value("${keyvalue}")
        private String key2;
	
	@RequestMapping(value="/testApi",method=RequestMethod.GET)
    ProductDto home() {
        keyvalue
	System.out.println("1)secret is "+ key)); 	
	System.out.println("2)secret is "+ key2));	
	//System.out.println("secret is "+ environment.getProperty("testsecretkey")); 
        ProductDto product=new ProductDto(key2,100);
        return product;
    }
	
	

}
