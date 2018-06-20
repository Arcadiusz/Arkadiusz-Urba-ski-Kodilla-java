package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Smith");
        LocalDateTime dateOfOrder = LocalDateTime.of(2018,6,10,15,12);

        OrderRequest orderRequest = new OrderRequest(user,dateOfOrder,1234567);
        int itemID = orderRequest.getItemID();

        return new OrderRequest(user,dateOfOrder,itemID );
    }
}
