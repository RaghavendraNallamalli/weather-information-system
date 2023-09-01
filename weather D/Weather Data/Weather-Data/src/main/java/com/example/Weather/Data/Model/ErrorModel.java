package com.example.Weather.Data.Model;

import org.springframework.http.HttpStatus;

public class ErrorModel {
  public HttpStatus getStatus() {

    return this.status;
  }

  public void setStatus(HttpStatus status) {

    this.status = status;
  }

  public String getMessage() {

    return this.message;
  }

  public void setMessage(String message) {

    this.message = message;
  }

  private HttpStatus status;

  private String message;

  public ErrorModel(HttpStatus status, String message) {

    this.status = status;
    this.message = message;
  }

}
