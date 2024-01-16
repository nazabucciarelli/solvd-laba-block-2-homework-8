package com.solvd.animals_mvc.design_patterns.listener.publisher;

import com.solvd.animals_mvc.design_patterns.listener.subscriber.ISuscriber;

import java.util.ArrayList;
import java.util.List;

public class GamesCompany {
    private final List<ISuscriber> subscribers = new ArrayList<>();

    public void subscribe(ISuscriber subscriber) {
        if (!subscribers.contains(subscriber))
            subscribers.add(subscriber);
    }

    public void unsubscribe(ISuscriber gamer) {
        subscribers.remove(gamer);
    }

    public void notifySubscribers(String notification) {
        subscribers.forEach((subscriber) -> {
            subscriber.update(notification);
        });
    }
}
