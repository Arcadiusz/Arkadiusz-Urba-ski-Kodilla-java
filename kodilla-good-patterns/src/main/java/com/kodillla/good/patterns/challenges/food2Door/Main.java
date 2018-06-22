package com.kodillla.good.patterns.challenges.food2Door;

public class Main {

    public static void main( String [] args ){

        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = requestRetriever.retrieve();

        OrderService orderService = new OrderService();
        orderService.createOrder(new ExtraFoodShop(), orderRequest);
        System.out.println();
        orderService.createOrder(new GlutenFreeShop(),orderRequest);
        System.out.println();
        orderService.createOrder(new HealthyShop(),orderRequest);
    }
}
