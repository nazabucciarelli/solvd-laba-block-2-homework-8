package com.solvd.animals_mvc.design_patterns.strategy.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GoogleLogin implements LoginStrategy{
    private static final Logger LOGGER = LogManager.getLogger(GoogleLogin.class);
    private String gmail;
    private String password;

    @Override
    public void collectLoginDetails() {
        // Pop-Up to fill in login data...
        this.gmail = "example@hotmail.com";
        this.password = "secret";
    }

    @Override
    public boolean validateLoginDetails() {
        // Validating the account in google servers...
        return true;
    }

    @Override
    public void login() {
        LOGGER.info("Connecting Google account...");
        LOGGER.info("Connected!");
    }
}
