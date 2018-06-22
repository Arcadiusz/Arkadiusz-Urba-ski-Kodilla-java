package com.kodillla.good.patterns.challenges.food2Door;

import com.kodillla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public class OrderRequest {

    private LocalDateTime dateOfOrder;
    private Product product;
    private int quantityInKilos;

    public OrderRequest(LocalDateTime dateOfOrder, Product product, int quantityInKilos) {
        this.dateOfOrder = dateOfOrder;
        this.product = product;
        this.quantityInKilos = quantityInKilos;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityInKilos() {
        return quantityInKilos;
    }
}
