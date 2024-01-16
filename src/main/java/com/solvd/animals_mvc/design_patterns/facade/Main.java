package com.solvd.animals_mvc.design_patterns.facade;

import com.solvd.animals_mvc.design_patterns.facade.burger_library.Burger;
import com.solvd.animals_mvc.design_patterns.facade.facade.BurgerRestaurant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();
        Burger burger = burgerRestaurant.orderBurger();
        LOGGER.info(burger);
    }
}
