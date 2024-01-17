package com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant;

import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.IBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.CheeseBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.IPasta;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.SpaghettiPasta;

public class RegularRestaurantFactory extends RestaurantFactory {
    @Override
    public IBurger createBurger() {
        return new CheeseBurger();
    }

    @Override
    public IPasta createPasta() {
        return new SpaghettiPasta();
    }
}
