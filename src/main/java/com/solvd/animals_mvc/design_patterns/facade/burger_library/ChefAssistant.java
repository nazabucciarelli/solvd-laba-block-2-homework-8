package com.solvd.animals_mvc.design_patterns.facade.burger_library;

import java.util.List;

public class ChefAssistant {
    public void bringIngredientsToChef(Chef chef, List<Ingredient> burgerIngredients){
        chef.getIngredients(burgerIngredients);
    }
}
