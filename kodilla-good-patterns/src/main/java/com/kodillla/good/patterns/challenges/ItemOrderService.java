package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderService implements OrderService {
    @Override
    public boolean order (User user, LocalDateTime dateOfOrder, int itemID){
        System.out.println("Order of Item #" + itemID +  " has been created by user " + user + " at " + dateOfOrder);
        return true;
    }
}
