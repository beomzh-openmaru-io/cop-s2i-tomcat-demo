package com.openmaru.tomcat_spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TomcatSpringApplicationTests {

	@org.springframework.beans.factory.annotation.Autowired
	private org.springframework.context.ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		org.junit.jupiter.api.Assertions.assertNotNull(applicationContext, "ApplicationContext should have loaded");
	}

}
