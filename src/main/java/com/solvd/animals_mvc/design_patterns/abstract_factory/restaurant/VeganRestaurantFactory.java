package com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant;

import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.IBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.VeganIBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.IPasta;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.VeganIPasta;

public class VeganRestaurantFactory extends RestaurantFactory {
    @Override
    public IBurger createBurger() {
        return new VeganIBurger();
    }

    @Override
    public IPasta createPasta() {
        return new VeganIPasta();
    }
}
