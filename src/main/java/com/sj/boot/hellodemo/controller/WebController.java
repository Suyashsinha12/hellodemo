package com.sj.boot.hellodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/web")
public class WebController {

	@RequestMapping(value="/hi")
	public String sayHello() {
		
		return "Hello World";
		
	}
	
}
