package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime dateOfOrder;
    private int itemID;

    public OrderRequest(User user, LocalDateTime dateOfOrder, int itemID) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.itemID = itemID;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public int getItemID(){
        return itemID;
    }

}
