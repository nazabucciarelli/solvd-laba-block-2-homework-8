package com.solvd.animals_mvc.design_patterns.factory_method.computer;

import com.solvd.animals_mvc.design_patterns.factory_method.operative_system.IOperativeSystem;

public abstract class Computer {
    private IOperativeSystem operativeSystem;

    public void installOperativeSystem(){
        this.operativeSystem = createOperativeSystem();
    }

    public abstract IOperativeSystem createOperativeSystem(); // This is the factory method
}
