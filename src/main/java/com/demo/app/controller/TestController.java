package com.demo.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/testApi",method=RequestMethod.GET)
    TestDto home() {
         
        TestDto test=new TestDto("Product",100);
        return test;
    }
	
	

}
