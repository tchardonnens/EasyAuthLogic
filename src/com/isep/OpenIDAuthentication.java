package com.isep;

public class OpenIDAuthentication implements AuthenticationStrategy{
    public void authenticate(){
        System.out.println("OpenID Authentication");
    }
}
