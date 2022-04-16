package com.ivanov.spring.rest.exeption_handling;

public class NoSuchEmployeeExсeption extends RuntimeException {
    public NoSuchEmployeeExсeption(String message) {
        super(message);
    }
}
