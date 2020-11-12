package com.sj.boot.hellodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/simple")
public class SimpleController {
	
	@RequestMapping(value="/hello")
	public String sayHello() {
		System.out.println("hi");
		return "/success.html";
	}

	@RequestMapping(value="/hi")
	public String sayHi(Model model) {
		System.out.println("hi....");
		model.addAttribute("msg","Welcome");
		
		return "/success";
	}

	
}
