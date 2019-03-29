package com.boco.example.demo.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTests {

	private MockMvc mvc;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testHelloController() throws Exception {
		MvcResult result = mvc.perform(
				MockMvcRequestBuilders.get("/sayhello")
						.param("name", "Liuxing")
						.accept(MediaType.APPLICATION_JSON)).andReturn();
		int httpState = result.getResponse().getStatus();
		String content = result.getResponse().getContentAsString();
		System.out.println(httpState +"---------------"+content);

	}

}
