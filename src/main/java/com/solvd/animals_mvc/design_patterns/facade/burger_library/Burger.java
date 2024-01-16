package com.solvd.animals_mvc.design_patterns.facade.burger_library;

import java.util.List;

public class Burger {
    private final List<Ingredient> ingredients;

    public Burger(List<Ingredient> burgerIngredients){
        this.ingredients = burgerIngredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "ingredients=" + ingredients +
                '}';
    }
}
