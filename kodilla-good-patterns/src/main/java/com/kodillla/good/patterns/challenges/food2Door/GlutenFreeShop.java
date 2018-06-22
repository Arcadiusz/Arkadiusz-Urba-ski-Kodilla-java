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

    public boolean process(OrderRequest orderRequest){
        if(orderRequest.getProduct().getProductName().equals("Potatoes")){
            System.out.println("Welcome to " + shopName);
            System.out.println("Currently" + orderRequest.getProduct().getProductName() + " out of stock");
            return false;
        }else{
            return true;
        }

    }
}
