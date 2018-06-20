package com.kodillla.good.patterns.challenges;

public class ProductOrderService {

    public static void main ( String [] args ){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor processor = new OrderProcessor(new TextMessageInformationService(),new ItemOrderService() ,new ItemOrderRepository());
        processor.process(orderRequest);

    }
}
