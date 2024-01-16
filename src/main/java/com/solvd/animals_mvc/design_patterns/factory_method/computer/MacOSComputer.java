package com.solvd.animals_mvc.design_patterns.factory_method.computer;

import com.solvd.animals_mvc.design_patterns.factory_method.operative_system.IOperativeSystem;
import com.solvd.animals_mvc.design_patterns.factory_method.operative_system.MacOS;

public class MacOSComputer extends Computer{
    @Override
    public IOperativeSystem createOperativeSystem() {
        return new MacOS();
    }
}
