package com.example.smpoject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmpojectApplicationTests {

	@Value("${spring.datasource.username}")
	private String username;

	@Test
	void contextLoads() {
	}

	@Test
	void dbUserNameIsSa() {
		Assertions.assertEquals("sa", username);
	}
}