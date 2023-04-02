package com.isep;

public class OAuthAuthentication implements AuthenticationStrategy{
    public void authenticate(){
        System.out.println("OAuth");
    }
}
