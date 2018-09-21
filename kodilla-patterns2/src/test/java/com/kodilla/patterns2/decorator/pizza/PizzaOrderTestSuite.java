package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderDescription() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Basic Pizza", description);
    }

    @Test
    public void testBasicPizzaOrderPrice() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        Assert.assertEquals(new BigDecimal(15.00), price);
    }

    @Test
    public void testBasicPizzaWithChickenPrice() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        Assert.assertEquals(new BigDecimal(25), price);
    }

    @Test
    public void testBasicPizzaWithVegetablesAndMayonnaiseDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new VegetablesDecorator(pizzaOrder);
        pizzaOrder = new MayonnaiseDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Basic Pizza + vegetables + mayonnaise", description);
    }

    @Test
    public void testBasicPizzaWithChickenMushroomsGarlicSauceandExtraCheesePrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        Assert.assertEquals(new BigDecimal(32.50), price);
    }
}
