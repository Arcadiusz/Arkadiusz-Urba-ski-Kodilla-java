package com.kodillla.good.patterns.challenges.food2Door;

public class ExtraFoodShop implements Shop {

    private final String shopName = "ExtraFoodShop";

    public boolean process(OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);
        System.out.println("Only today 10% discount on all products");
        return true;
    }
}
