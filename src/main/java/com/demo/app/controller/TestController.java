package com.demo.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    TestDto home() {
         
        TestDto test=new TestDto("mk",3);
        return test;
    }
	
	

}
