package com.aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
public class ProductController {
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value="/testApi",method=RequestMethod.GET)
    ProductDto home() {
         System.out.println("secret is "+ environment.getProperty("testsecretkey")); 
        ProductDto product=new ProductDto(environment.getProperty("testsecretkey"),100);
        return product;
    }
	
	

}
