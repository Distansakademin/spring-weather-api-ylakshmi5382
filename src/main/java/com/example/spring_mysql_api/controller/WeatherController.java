package com.example.spring_mysql_api.controller;

import com.jensen.weather.rest.api.WeatherapiApi;
import com.jensen.weather.rest.model.Listcitiesresponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WeatherController implements WeatherapiApi {

    @Override
    public ResponseEntity<String> cityweather(String cityId) {
        return ResponseEntity.status(HttpStatus.OK).body("London");
    }

    @Override
    public ResponseEntity<Listcitiesresponse> getCities(String countryId) {
        Listcitiesresponse listcitiesresponse = Listcitiesresponse.builder().cities(Arrays.asList("london", "malmo", "stockholm")).build();
               return ResponseEntity.status(HttpStatus.OK).body(listcitiesresponse);
    }
}
