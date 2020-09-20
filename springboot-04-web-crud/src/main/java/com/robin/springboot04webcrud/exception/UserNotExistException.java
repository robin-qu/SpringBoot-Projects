package com.robin.springboot04webcrud.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("User does not exist!");
    }
}
