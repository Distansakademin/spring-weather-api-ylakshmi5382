package com.example.spring_mysql_api;

import com.example.spring_mysql_api.controller.WeatherController;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMysqlApiApplicationTests {

	@Mock
	WeatherController weatherController;

	@Test
	void contextLoads() {
	}

}
