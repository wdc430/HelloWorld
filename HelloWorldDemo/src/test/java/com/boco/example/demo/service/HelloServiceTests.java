package com.boco.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTests {
	
	@Autowired
	private IHelloService helloService;
	
	@Test
	public void TestSayHello(){
		String greet = helloService.sayHello("Liuxing");
		System.out.println(greet);
	}

}
