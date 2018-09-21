package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator  extends AbstractPizzaOrderDecorator {

    public MushroomsDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    public String getDecription() {
        return super.getDescription() + " + mushrooms";
    }
}
