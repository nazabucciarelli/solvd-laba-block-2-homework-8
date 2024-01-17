package com.solvd.animals_mvc.design_patterns.strategy.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FacebookLogin implements LoginStrategy{
    private static final Logger LOGGER = LogManager.getLogger(FacebookLogin.class);
    private String email;
    private String password;

    @Override
    public void collectLoginDetails() {
        // Pop-Up to fill in login data...
        this.email = "example@hotmail.com";
        this.password = "secret";
    }

    @Override
    public boolean validateLoginDetails() {
        // Validating account on Facebook servers...
        return true;
    }

    @Override
    public void login() {
        LOGGER.info("Connecting Facebook account...");
        LOGGER.info("Connected!");
    }
}
