package com.solvd.animals_mvc.design_patterns.abstract_factory;

import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.IBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.IPasta;
import com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant.RegularRestaurantFactory;
import com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant.RestaurantFactory;
import com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant.VeganRestaurantFactory;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory veganRestaurantFactory = new VeganRestaurantFactory();
        IBurger veganIBurger = veganRestaurantFactory.createBurger();
        IPasta veganIPasta = veganRestaurantFactory.createPasta();

        RestaurantFactory regularRestaurantFactory = new RegularRestaurantFactory();
        IBurger cheeseIBurger = regularRestaurantFactory.createBurger();
        IPasta spagghetiIPasta = regularRestaurantFactory.createPasta();
    }
}
