package com.john.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	
	@RequestMapping("/provider")
	public String hello() {
		
		return "hello, i am provider";
	}
}
