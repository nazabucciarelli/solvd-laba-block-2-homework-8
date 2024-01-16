package com.solvd.animals_mvc.design_patterns.facade.burger_library;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private List<Ingredient> ingredientList;

    public Chef() {
        this.ingredientList = new ArrayList<>();
    }

    public Burger cookBurger() {
        return new Burger(ingredientList);
    }

    public void getIngredients(List<Ingredient> ingredients) {
        ingredientList.addAll(ingredients);
    }
}
