package com.example.Weather.Forecast.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Weather.Forecast.Model.WeatherForecast;
import com.example.Weather.Forecast.Service.WeatherForecastService;

@RestController

public class WeatherForecastController {

  @Autowired

  private WeatherForecastService weatherForecastService;

  @GetMapping("/forecast")

  public ResponseEntity<WeatherForecast> getWeatherForecast(@RequestParam String location) {

    WeatherForecast forecast = this.weatherForecastService.getWeatherForecast(location);

    return ResponseEntity.ok(forecast);

  }

}

//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
//
// import com.example.Weather.Forecast.Model.WeatherForecastData;
// import com.example.Weather.Forecast.Service.WeatherForecastService;
//
// @RestController
// public class WeatherForecastController {
//
// @Autowired
// private WeatherForecastService weatherForecastService;
//
// @GetMapping("/forecast")
// public ResponseEntity<WeatherForecastData> getWeatherForecast(@RequestParam String location) {
//
// WeatherForecastData forecastData = this.weatherForecastService.getWeatherForecast(location);
// return ResponseEntity.ok(forecastData);
// }
// }
