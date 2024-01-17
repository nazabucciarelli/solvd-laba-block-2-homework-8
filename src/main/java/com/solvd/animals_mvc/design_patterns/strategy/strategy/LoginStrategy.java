package com.solvd.animals_mvc.design_patterns.strategy.strategy;

public interface LoginStrategy {
    void collectLoginDetails();
    boolean validateLoginDetails();
    void login();
}
