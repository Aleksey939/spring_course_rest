package com.ivanov.spring.rest.exeption_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeExсeption exсeption){
        EmployeeIncorrectData data=new EmployeeIncorrectData();
        data.setInfo(exсeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception exсeption){
        EmployeeIncorrectData data=new EmployeeIncorrectData();
        data.setInfo(exсeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
