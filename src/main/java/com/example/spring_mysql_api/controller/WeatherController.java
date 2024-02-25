package com.example.spring_mysql_api.controller;

import com.example.spring_mysql_api.repository.WeatherEntity;
import com.example.spring_mysql_api.service.WeatherService;
import com.jensen.weather.rest.api.WeatherapiApi;
import com.jensen.weather.rest.model.Listcitiesresponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class WeatherController implements WeatherapiApi {


    public final WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @Override
    public ResponseEntity<String> cityweather(String cityId) {
        var weatherById = weatherService.getWeatherById(cityId);
        return ResponseEntity.status(HttpStatus.OK).body(weatherById.getTodayTempurature());
    }

    @Override
    public ResponseEntity<Listcitiesresponse> getCities(String countryId) {
        var cities = weatherService.getAllCitiesByCountry(countryId);
        List<String> city = cities.stream().map(f -> f.getCity()).collect(Collectors.toList());
        Listcitiesresponse listcitiesresponse = Listcitiesresponse.builder().cities(city).build();
               return ResponseEntity.status(HttpStatus.OK).body(listcitiesresponse);
    }
}
