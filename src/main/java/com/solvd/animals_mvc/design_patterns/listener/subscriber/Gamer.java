package com.solvd.animals_mvc.design_patterns.listener.subscriber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Gamer implements ISuscriber{
    private static final Logger LOGGER = LogManager.getLogger(Gamer.class);

    @Override
    public void update(String notification) {
        LOGGER.info(notification);
    }
}
