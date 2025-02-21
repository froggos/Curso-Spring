package com.benjamin.curso.springboot.error.springboot_error.exceptions;

public class UserNotFoundexception extends RuntimeException {
    public UserNotFoundexception(String message) {
        super(message);
    }
}
