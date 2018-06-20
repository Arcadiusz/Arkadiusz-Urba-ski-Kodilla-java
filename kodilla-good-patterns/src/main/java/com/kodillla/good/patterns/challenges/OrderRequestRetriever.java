package com.kodillla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Smith");
        LocalDateTime dateOfOrder = LocalDateTime.of(2018,6,10,15,12);
        int itemID = 1234567;

        return new OrderRequest(user,dateOfOrder,itemID );
    }
}
