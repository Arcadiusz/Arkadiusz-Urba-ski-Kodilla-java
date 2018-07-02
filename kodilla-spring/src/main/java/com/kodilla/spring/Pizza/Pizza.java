package com.kodilla.spring.Pizza;

import org.springframework.stereotype.Component;

public class Pizza {

    private int price;
    private String name;

    public Pizza(int price, String name) {
    this.price = price;
    this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
