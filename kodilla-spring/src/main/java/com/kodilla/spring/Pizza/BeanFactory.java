package com.kodilla.spring.Pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {


    @Bean
    public Pizza getPizza(){
        return new Pizza(15,"Capriciosa");
    }

    @Bean
    public Order getOrder(Pizza pizza){
        return new Order(pizza);
    }

}
