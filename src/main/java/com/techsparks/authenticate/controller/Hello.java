package com.techsparks.authenticate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	@RequestMapping(value  = "/hello")
	@ResponseBody
	private String sayHello() {
		return "Hello World";
	}
	
}
