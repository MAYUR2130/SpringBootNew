package com.aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping(value="/testApi",method=RequestMethod.GET)
    ProductDto home() {
         
        ProductDto product=new ProductDto("Product",100);
        return product;
    }
	
	

}
