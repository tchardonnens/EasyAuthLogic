package com.isep;

public class Main {

    public static void main(String[] args) {
        AuthProgram basicAuthProgram = new AuthProgram(new BasicAuthentication());
        basicAuthProgram.authenticate("Test", "toto");

        AuthProgram oAuthProgram = new AuthProgram(new OAuthAuthentication());
        oAuthProgram.authenticate("Test", "toto");

        AuthProgram openIdAuthProgram = new AuthProgram(new OpenIDAuthentication());
        openIdAuthProgram.authenticate("Test", "toto");
    }
}
