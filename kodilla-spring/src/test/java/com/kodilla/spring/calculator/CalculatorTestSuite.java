package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);

        //When
        double addResult = calc.add(10.1,2.1);
        double subResult = calc.sub(10.5,2.1);
        double mulResult = calc.mul(10.2,2.5);
        double divResult = calc.div(10.5,2.1);

        //Then
        Assert.assertEquals(12.2, addResult, 0.01);
        Assert.assertEquals(8.4, subResult, 0.01);
        Assert.assertEquals(25.5, mulResult, 0.01);
        Assert.assertEquals(5, divResult, 0.01);
    }
}
