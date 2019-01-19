package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplicationTests.class);
	List<String> passwordsToBeHased = Arrays.asList("12345678","1234asdc","Aa@12345");

	@Autowired
	private SecurityConfig securityConfig;

	@Test
	public void contextLoads() {
		passwordsToBeHased.forEach(password ->
				LOGGER.info("Hash value of password " + password + "is :" + securityConfig.passwordEncoder().encode(password)));

	}
}
