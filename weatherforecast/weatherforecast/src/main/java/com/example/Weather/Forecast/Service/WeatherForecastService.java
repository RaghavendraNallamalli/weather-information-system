package com.example.Weather.Forecast.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Weather.Forecast.Model.WeatherForecast;

@Service
public class WeatherForecastService {

  @Value("${visualcrossing.api.key}")
  private String apiKey;

  public WeatherForecast getWeatherForecast(String location) {

    String apiUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + location
        + "?key=" + this.apiKey;

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<WeatherForecast> response = restTemplate.getForEntity(apiUrl, WeatherForecast.class);

    return response.getBody();
  }
}

// package com.example.Weather.Forecast.Service;
//
// import com.example.Weather.Forecast.Model.WeatherForecastData;
// import com.example.Weather.Forecast.Exception.WeatherForecastServiceException;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;
//
// @Service
// public class WeatherForecastService {
//
// @Value("${weatherstack.api.key}")
// private String apiKey;
//
// public WeatherForecastData getWeatherForecast(String location) {
// String apiUrl = "http://api.weatherstack.com/forecast?access_key=" + this.apiKey + "&query=" + location;
//
// RestTemplate restTemplate = new RestTemplate();
// WeatherForecastData forecastData = restTemplate.getForObject(apiUrl, WeatherForecastData.class);
//
// if (forecastData != null) {
// return forecastData;
// } else {
// throw new WeatherForecastServiceException("Unable to fetch weather forecast for location: " + location);
// }
// }
// }
