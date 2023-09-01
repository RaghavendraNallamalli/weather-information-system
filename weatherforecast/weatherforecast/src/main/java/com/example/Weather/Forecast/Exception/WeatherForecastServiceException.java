package com.example.Weather.Forecast.Exception;

public class WeatherForecastServiceException extends RuntimeException {
    public WeatherForecastServiceException(String message) {
        super(message);
    }

    public WeatherForecastServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
