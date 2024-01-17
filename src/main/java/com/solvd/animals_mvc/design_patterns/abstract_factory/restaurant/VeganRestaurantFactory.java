package com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant;

import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.IBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.VeganBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.IPasta;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.VeganPasta;

public class VeganRestaurantFactory extends RestaurantFactory {
    @Override
    public IBurger createBurger() {
        return new VeganBurger();
    }

    @Override
    public IPasta createPasta() {
        return new VeganPasta();
    }
}
