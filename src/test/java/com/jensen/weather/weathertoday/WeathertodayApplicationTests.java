package com.jensen.weather.weathertoday;

import com.jensen.weather.weathertoday.controller.WeatherController;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeathertodayApplicationTests {

	@Mock
	WeatherController weatherController;

	@Test
	void contextLoads() {
	}

}
