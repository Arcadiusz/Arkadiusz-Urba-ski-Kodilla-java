package com.kodillla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {

    private final String shopName = "GlutenFreeShop";

    Map<String, Double> productsMap = new HashMap<>();


    public GlutenFreeShop() {
        this.productsMap.put("Bread", 12.50);
        this.productsMap.put("Cornflakes", 15.00);
        this.productsMap.put("Fish", 7.40);

    }

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println("Welcome to " + shopName);
        if (productsMap.containsKey(orderRequest.getProduct().getProductName()) && orderRequest.getQuantityInKilos()<productsMap.get(orderRequest.getProduct().getProductName())) {
            return true;
        }else{
            System.out.println("Not enough product");
            return false;
        }

    }
}
