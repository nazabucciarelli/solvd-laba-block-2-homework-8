package com.solvd.animals_mvc.design_patterns.listener;

import com.solvd.animals_mvc.design_patterns.listener.publisher.GamesCompany;
import com.solvd.animals_mvc.design_patterns.listener.subscriber.Gamer;
import com.solvd.animals_mvc.design_patterns.listener.subscriber.ISuscriber;

public class Main {
    public static void main(String[] args) {
        GamesCompany rockstarGames = new GamesCompany();

        ISuscriber robert = new Gamer();
        ISuscriber louis = new Gamer();
        ISuscriber amanda = new Gamer();

        rockstarGames.subscribe(robert);
        rockstarGames.subscribe(louis);
        rockstarGames.subscribe(amanda);

        rockstarGames.unsubscribe(robert);

        rockstarGames.notifySubscribers("A new game has been released!");
    }
}
