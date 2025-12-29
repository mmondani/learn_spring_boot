package com.mmondani.restful_web_services.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFountException extends RuntimeException {
    public UserNotFountException(String s) {
        super(s);
    }
}
