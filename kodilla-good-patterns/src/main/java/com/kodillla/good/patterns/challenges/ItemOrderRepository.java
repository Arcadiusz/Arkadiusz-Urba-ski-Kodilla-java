package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime dateOfOrder, int itemID ){
        System.out.println("Adding order to repository... ");
        return true;
    }
}
