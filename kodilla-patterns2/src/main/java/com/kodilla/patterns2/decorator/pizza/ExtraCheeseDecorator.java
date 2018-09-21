package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1.50));
    }

    public String etDescription() {
        return super.getDescription() + " + extra cheese";
    }
}
