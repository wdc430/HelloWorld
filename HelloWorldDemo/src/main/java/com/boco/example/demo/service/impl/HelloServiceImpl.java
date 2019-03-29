package com.boco.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.boco.example.demo.service.IHelloService;

@Service(value="helloService")
public class HelloServiceImpl implements IHelloService{

	@Override
	public String sayHello(String name) {
		
		return "Hello," + name + ",This is spring boot service.";
	}

}
