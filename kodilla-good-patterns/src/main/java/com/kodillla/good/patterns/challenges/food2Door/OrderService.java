package com.kodillla.good.patterns.challenges.food2Door;

public class OrderService {

        public void createOrder (final Shop shop, final OrderRequest orderRequest){
            boolean ordered = shop.process(orderRequest);
            if (ordered) {
                System.out.println("Your order of " + orderRequest.getQuantityInKilos() + " kilos of " + orderRequest.getProduct().productName + " has been succesfully created...");
            } else {
                System.out.println("Your order has been declined " );
            }
        }
    }

