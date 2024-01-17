package com.solvd.animals_mvc.design_patterns.decorator.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SlackNotifierDecorator extends BaseNotifierDecorator {
    private static final Logger LOGGER = LogManager.getLogger(SlackNotifierDecorator.class);

    SlackNotifierDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        LOGGER.info("Sending email to " + this.getUsername() + " the message is: "
                + message + " | from SlackNotifierDecorator");
    }
}
