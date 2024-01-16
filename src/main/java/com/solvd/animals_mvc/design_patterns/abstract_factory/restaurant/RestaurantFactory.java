package com.solvd.animals_mvc.design_patterns.abstract_factory.restaurant;

import com.solvd.animals_mvc.design_patterns.abstract_factory.burger.IBurger;
import com.solvd.animals_mvc.design_patterns.abstract_factory.pasta.IPasta;

public abstract class RestaurantFactory { //This is the abstract factory class

    public abstract IBurger createBurger();

    public abstract IPasta createPasta();

}
