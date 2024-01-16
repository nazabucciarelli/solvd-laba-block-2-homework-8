package com.solvd.animals_mvc.design_patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SMSNotifier implements INotifier {
    private static final Logger LOGGER = LogManager.getLogger(SMSNotifier.class);
    private final String username;

    public SMSNotifier(String username) {
        this.username = username;
    }

    @Override
    public void send(String message) {
        LOGGER.info("Sending email to " + this.getUsername() + " the message is: "
                + message + " | from SMSNotifier");
    }

    @Override
    public String getUsername() {
        return username;
    }
}
