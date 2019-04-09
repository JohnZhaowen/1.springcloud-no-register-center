package com.john.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	/**
	 * 注入RestTemplate
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer")
	public String hello() {	
		//服务调用，需要知道被调用服务的地址，端口
		return restTemplate.getForObject("http://localhost:8070/provider", String.class);
	}
}
