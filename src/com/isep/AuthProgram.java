package com.isep;

public class AuthProgram {
    private AuthenticationStrategy authenticationStrategy;

    public AuthProgram(AuthenticationStrategy authenticationStrategy){
        this.authenticationStrategy = authenticationStrategy;
    }

    public void authenticate(String username, String password){
        authenticationStrategy.authenticate();
    }

}
