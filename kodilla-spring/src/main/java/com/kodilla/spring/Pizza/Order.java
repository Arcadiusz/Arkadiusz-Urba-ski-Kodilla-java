package com.kodilla.spring.Pizza;


import org.springframework.stereotype.Component;

public class Order {

    Pizza pizza;

    public Order(Pizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder(){
        System.out.println("Zamowienie na pizze : " + pizza.getName() + " | cena : " + pizza.getPrice());
    }
}
