package com.kodillla.good.patterns.challenges;

import com.kodillla.good.patterns.challenges.food2Door.HealthyShop;
import com.kodillla.good.patterns.challenges.food2Door.Shop;

public class ProductOrderService {

    public static void main ( String [] args ){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        Shop shop = new HealthyShop();

        OrderProcessor processor = new OrderProcessor(new TextMessageInformationService(),new ItemOrderService() ,new ItemOrderRepository());
        processor.process(orderRequest);

    }
}
