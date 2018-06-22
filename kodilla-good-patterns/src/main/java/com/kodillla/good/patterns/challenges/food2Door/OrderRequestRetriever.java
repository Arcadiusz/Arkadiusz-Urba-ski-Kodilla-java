package com.kodillla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        LocalDateTime dateOfOrder = LocalDateTime.of(2018,6,10,15,12);
        Product potatoes = new Product("Potatoes",3.20);
        int quantityInKilos = 10;

        return new OrderRequest(dateOfOrder, potatoes, quantityInKilos);
    }
}