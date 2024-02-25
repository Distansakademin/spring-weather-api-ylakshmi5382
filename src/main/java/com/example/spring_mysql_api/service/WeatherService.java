package com.example.spring_mysql_api.service;

import com.example.spring_mysql_api.repository.WeatherEntity;
import com.example.spring_mysql_api.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    // Read
    public List<WeatherEntity> getAllCitiesByCountry(String country) {
        return weatherRepository.findByCountry(country);
    }

    public WeatherEntity getWeatherById(String city) {
        return weatherRepository.findByCity(city);
    }

}
