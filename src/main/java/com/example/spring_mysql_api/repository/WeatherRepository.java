package com.example.spring_mysql_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherEntity,Long> {

    List<WeatherEntity> findByCountry(String country);

    WeatherEntity findByCity(String city);
}
