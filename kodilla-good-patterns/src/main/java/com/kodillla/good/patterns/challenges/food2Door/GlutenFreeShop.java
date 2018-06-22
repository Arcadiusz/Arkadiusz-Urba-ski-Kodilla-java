package com.kodillla.good.patterns.challenges.food2Door;

public class GlutenFreeShop implements Shop {

    private final String shopName = "GlutenFreeShop";

    public boolean process(OrderRequest orderRequest){
        if(orderRequest.getProduct().productName.equals("Potatoes")){
            System.out.println("Welcome to " + shopName);
            System.out.println("Currently" + orderRequest.getProduct().productName + " out of stock");
            return false;
        }else{
            return true;
        }

    }
}
