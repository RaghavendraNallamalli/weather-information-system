package com.example.Weather.Data.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//used lombok for getters and setters

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class WeatherData {
  private Double temperature;

  private String weather_descriptions;

}

// public Double getTemperature() {
//
// return this.temperature;
// }
//
// public void setTemperature(Double temperature) {
//
// this.temperature = temperature;
// }
//
// public String getWeather_descriptions() {
//
// return this.weather_descriptions;
// }
//
// public void setWeather_descriptions(String weather_descriptions) {
//
// this.weather_descriptions = weather_descriptions;
// }