package com.kodilla.spring.Pizza;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaMain {

    public static void main ( String [] args ){

      /*  IPizza pizza = new GoodPizza(15,"Dobra");
        Order order = new Order(pizza);
        order.printOrder();*/

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Order order = context.getBean(Order.class);
        order.printOrder();
    }
}
