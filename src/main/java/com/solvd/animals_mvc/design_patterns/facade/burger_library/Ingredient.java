package com.solvd.animals_mvc.design_patterns.facade.burger_library;

public class Ingredient {
    private final String name;

    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
