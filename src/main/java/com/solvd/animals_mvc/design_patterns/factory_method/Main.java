package com.solvd.animals_mvc.design_patterns.factory_method;

import com.solvd.animals_mvc.design_patterns.factory_method.computer.Computer;
import com.solvd.animals_mvc.design_patterns.factory_method.computer.MacOSComputer;
import com.solvd.animals_mvc.design_patterns.factory_method.computer.WindowsComputer;
import com.solvd.animals_mvc.design_patterns.factory_method.operative_system.IOperativeSystem;

public class Main {
    public static void main(String[] args) {
        Computer windowsComputer = new WindowsComputer();
        IOperativeSystem windowsOS = windowsComputer.createOperativeSystem();

        Computer macOSComputer = new MacOSComputer();
        IOperativeSystem macOS = macOSComputer.createOperativeSystem();
    }
}
