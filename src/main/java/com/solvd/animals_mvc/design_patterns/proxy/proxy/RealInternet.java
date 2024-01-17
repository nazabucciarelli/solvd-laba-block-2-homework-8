package com.solvd.animals_mvc.design_patterns.proxy.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealInternet implements Internet{
    private static final Logger LOGGER = LogManager.getLogger(RealInternet.class);

    @Override
    public void connectToWebsite(String url) {
        LOGGER.info("Connected to " + url);
    }
}
