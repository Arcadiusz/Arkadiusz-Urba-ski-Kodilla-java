package com.kodillla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {

    private final String shopName = "HealthyShop";

    private static Map<String, Double> productsMap = new HashMap<>();

    static {
        productsMap.put("Lettuce", 4.00);
        productsMap.put("Broccoli", 6.50);
        productsMap.put("Spinach", 10.90);;
    }

    public HealthyShop() {
    }

    @Override
    public boolean process( OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);

        if (productsMap.containsKey(orderRequest.getProduct().getProductName())) {
            return true;
        }else {
            return false;
        }
    }

}
