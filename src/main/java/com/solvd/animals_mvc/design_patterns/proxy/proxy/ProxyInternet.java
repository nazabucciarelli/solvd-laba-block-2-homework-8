package com.solvd.animals_mvc.design_patterns.proxy.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyInternet implements Internet{
    private static final Logger LOGGER = LogManager.getLogger(ProxyInternet.class);
    private final Internet realInternet;
    private final List<String> bannedUrls;
    private final Map<String, String> cachedWebsites;


    public ProxyInternet(Internet realInternet, List<String> bannedUrls) {
        this.realInternet = realInternet;
        this.bannedUrls = bannedUrls;
        this.cachedWebsites = new HashMap<>();
    }

    @Override
    public void connectToWebsite(String url) {
        if(!bannedUrls.contains(url)){
            if(!cachedWebsites.containsKey(url)){
                LOGGER.info("Caching website...");
                cachedWebsites.put(url,"website_code");
            }
            realInternet.connectToWebsite(url);
        } else {
            LOGGER.error("The website " + url + " is banned");
        }

    }
}
