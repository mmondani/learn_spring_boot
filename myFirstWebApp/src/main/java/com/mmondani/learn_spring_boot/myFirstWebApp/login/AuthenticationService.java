package com.mmondani.learn_spring_boot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String user, String password) {
        boolean isValidname = user.equals("mariano");
        boolean isValidPassword = password.equals("1234");

        return (isValidname && isValidPassword);
    }
}
