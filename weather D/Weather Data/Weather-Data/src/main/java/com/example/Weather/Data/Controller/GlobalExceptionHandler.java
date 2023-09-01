package com.example.Weather.Data.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.Weather.Data.Model.ErrorModel;
import com.example.Weather.Data.Service.ExceptionService;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(ExceptionService.class)
  protected ResponseEntity<Object> handleWeatherServiceException(ExceptionService ex, WebRequest request) {

    // Creating a custom error response object
    ErrorModel errorResponse = new ErrorModel(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    return buildResponseEntity(errorResponse);
  }

  private ResponseEntity<Object> buildResponseEntity(ErrorModel errorResponse) {

    return new ResponseEntity<>(errorResponse, errorResponse.getStatus());
  }
}
