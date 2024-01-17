package com.solvd.animals_mvc.design_patterns.proxy;

import com.solvd.animals_mvc.design_patterns.proxy.proxy.Internet;
import com.solvd.animals_mvc.design_patterns.proxy.proxy.ProxyInternet;
import com.solvd.animals_mvc.design_patterns.proxy.proxy.RealInternet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bannedUrls = new ArrayList<>();
        bannedUrls.add("www.bannedurl.com");
        bannedUrls.add("www.anotherbannedurl.com");
        Internet proxyInternet = new ProxyInternet(new RealInternet(), bannedUrls);

        proxyInternet.connectToWebsite("www.facebook.com");
        proxyInternet.connectToWebsite("www.bannedurl.com");
        proxyInternet.connectToWebsite("www.facebook.com");
        proxyInternet.connectToWebsite("www.google.com");
    }
}
