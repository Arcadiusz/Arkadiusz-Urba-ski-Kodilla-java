package com.kodillla.good.patterns.challenges.food2Door;

public class HealthyShop implements Shop {

    private final String shopName = "HealthyShop";

    public boolean process( OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);
        return true;
    }

}
