package com.solvd.animals_mvc.design_patterns.strategy.context;

import com.solvd.animals_mvc.design_patterns.strategy.strategy.LoginStrategy;

public class WebsiteService {
    LoginStrategy loginStrategy;

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void login() {
        loginStrategy.collectLoginDetails();
        if (loginStrategy.validateLoginDetails()) {
            loginStrategy.login();
        }
    }
}
