package com.solvd.animals_mvc.design_patterns.facade.facade;

import com.solvd.animals_mvc.design_patterns.facade.burger_library.*;

import java.util.ArrayList;
import java.util.List;

public class BurgerRestaurant { // This is the Facade class

    public Burger orderBurger() {
        Chef chef = new Chef();
        ChefAssistant chefAssistant = new ChefAssistant();

        List<Ingredient> burgerIngredients = new ArrayList<>();
        Ingredient tomato = new Ingredient("Tomato");
        Ingredient meat = new Ingredient("Meat");
        burgerIngredients.add(tomato);
        burgerIngredients.add(meat);

        chefAssistant.bringIngredientsToChef(chef, burgerIngredients);
        return chef.cookBurger();
    }

}
