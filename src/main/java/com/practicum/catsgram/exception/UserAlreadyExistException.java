package com.practicum.catsgram.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String s) {
        super(s);
    }
}