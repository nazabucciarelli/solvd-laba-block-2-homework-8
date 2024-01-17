package com.solvd.animals_mvc.design_patterns.decorator.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TelegramNotifierDecorator extends BaseNotifierDecorator {
    private static final Logger LOGGER = LogManager.getLogger(TelegramNotifierDecorator.class);

    TelegramNotifierDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        LOGGER.info("Sending email to " + this.getUsername() + " the message is: "
                + message + " | from TelegramNotifierDecorator");
    }


}
