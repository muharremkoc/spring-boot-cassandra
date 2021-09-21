package com.example.springbootwithcassandra.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "User Already Exist")
public class UserAlreadyExistsException extends RuntimeException {
}
