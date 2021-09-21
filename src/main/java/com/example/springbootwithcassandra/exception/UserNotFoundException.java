package com.example.springbootwithcassandra.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "User Not Found ")
public class UserNotFoundException extends RuntimeException {
}
