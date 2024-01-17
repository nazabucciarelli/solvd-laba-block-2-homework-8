package com.solvd.animals_mvc.design_patterns.strategy;

import com.solvd.animals_mvc.design_patterns.strategy.context.WebsiteService;
import com.solvd.animals_mvc.design_patterns.strategy.strategy.FacebookLogin;
import com.solvd.animals_mvc.design_patterns.strategy.strategy.GoogleLogin;

public class Main {
    public static void main(String[] args) {
        WebsiteService websiteService = new WebsiteService();
        // Now the strategy can be picked easily at runtime
        websiteService.setLoginStrategy(new GoogleLogin());
        websiteService.login();

        websiteService.setLoginStrategy(new FacebookLogin());
        websiteService.login();
    }
}
