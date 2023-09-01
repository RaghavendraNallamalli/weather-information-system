package com.example.Weather.Forecast.Model;

public class WeatherForecast {

  private String location;

  private String date1;

  private String date2;

  private String description;

  private double temperature;

  // Getters and setters

  /**
   *
   * @return location
   * 
   */

  public String getLocation() {

    return this.location;

  }

  /**
   *
   * @param location new value of {@link #getlocation}.
   * 
   */

  public void setLocation(String location) {

    this.location = location;

  }

  /**
   *
   * @return date1
   * 
   */

  public String getDate1() {

    return this.date1;

  }

  /**
   *
   * @param date1 new value of {@link #getdate1}.
   * 
   */

  public void setDate1(String date1) {

    this.date1 = date1;

  }

  /**
   *
   * @return date2
   * 
   */

  public String getDate2() {

    return this.date2;

  }

  /**
   *
   * @param date2 new value of {@link #getdate2}.
   * 
   */

  public void setDate2(String date2) {

    this.date2 = date2;

  }

  /**
   *
   * @return description
   * 
   */

  public String getDescription() {

    return this.description;

  }

  /**
   *
   * @param description new value of {@link #getdescription}.
   * 
   */

  public void setDescription(String description) {

    this.description = description;

  }

  /**
   *
   * @return temperature
   * 
   */

  public double getTemperature() {

    return this.temperature;

  }

  /**
   *
   * @param temperature new value of {@link #gettemperature}.
   * 
   */

  public void setTemperature(double temperature) {

    this.temperature = temperature;

  }

}