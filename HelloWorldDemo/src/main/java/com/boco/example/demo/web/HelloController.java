package com.boco.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boco.example.demo.service.IHelloService;

@RestController
public class HelloController {
	
	@Autowired
	private IHelloService helloService;
	
	@RequestMapping("/hello")
	public String index(){
		return "Hello World,this is Spring Boot.";
	}
	
	@RequestMapping("/sayhello")
	public String greetToYou(String name){
		return helloService.sayHello(name);
	}

}
