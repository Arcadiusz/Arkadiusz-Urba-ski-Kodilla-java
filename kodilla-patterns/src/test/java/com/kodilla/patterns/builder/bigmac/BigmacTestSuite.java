package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("salad")
                .ingredient("shrimp")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String isBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        String wchichSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients,0);
        Assert.assertEquals("bun", isBun );
        Assert.assertEquals("1000 islands", wchichSauce);
        Assert.assertEquals(2, howManyBurgers,0);
    }
}
