package com.kodillla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private static Map<String, Shop> mapa = new HashMap<>();

    static {
        mapa.put("Potatoes", new ExtraFoodShop());
        mapa.put("Tomatoes", new ExtraFoodShop());
        mapa.put("Carrots", new ExtraFoodShop());
        mapa.put("Bread", new GlutenFreeShop());
        mapa.put("Cornflakes", new GlutenFreeShop());
        mapa.put("Fish", new GlutenFreeShop());
        mapa.put("Lettuce", new HealthyShop());
        mapa.put("Broccoli", new HealthyShop());
        mapa.put("Spinach", new HealthyShop());
    }

    private Shop findShop(Product product)  {
        Shop shop;
        if (mapa.containsKey(product.getProductName())) {
            return mapa.get(product.getProductName());
        } else {
            return null;
        }
    }


        public void createOrder (final OrderRequest orderRequest){

        Shop shop = findShop(orderRequest.getProduct());
        if (shop == null){
            System.out.println("No shop");
            return;
        }

            boolean ordered = shop.process(orderRequest);
            if (ordered) {
                System.out.println("Your order of " + orderRequest.getQuantityInKilos() + " kilos of " + orderRequest.getProduct().getProductName() + " has been succesfully created...");
            } else {
                System.out.println("Your order has been declined " );

            }
        }
    }

