package com.kodillla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {

    private final String shopName = "HealthyShop";

    Map<String, Double> productsMap = new HashMap<>();


    public HealthyShop() {
        this.productsMap.put("Lettuce", 4.00);
        this.productsMap.put("Broccoli", 6.50);
        this.productsMap.put("Spinach", 10.90);;
    }

    public boolean process( OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);
        return true;
    }

}
