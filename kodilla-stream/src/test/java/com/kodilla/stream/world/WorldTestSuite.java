package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("China",  new BigInteger("950000000")));
        europe.addCountry(new Country("India",  new BigInteger("600000000")));
        europe.addCountry(new Country("Japan",  new BigInteger("500000000")));

        Continent asia = new Continent("Asia");
        europe.addCountry(new Country("Poland",  new BigInteger("350000000")));
        europe.addCountry(new Country("Germany",  new BigInteger("550000000")));
        europe.addCountry(new Country("France",  new BigInteger("600000000")));

        Continent africa = new Continent("AFRICA");
        europe.addCountry(new Country("Egipt",  new BigInteger("300000000")));
        europe.addCountry(new Country("Cameroon",  new BigInteger("100000000")));
        europe.addCountry(new Country("RPA",  new BigInteger("450000000")));

        Continent northAmerica = new Continent("NA");
        northAmerica.addCountry(new Country("USA", new BigInteger("800000000")));
        northAmerica.addCountry(new Country("Canada", new BigInteger("500000000")));
        northAmerica.addCountry(new Country("Mexico", new BigInteger("300000000")));

        Continent southAmerica = new Continent("South America");
        northAmerica.addCountry(new Country("Brazil", new BigInteger("350000000")));
        northAmerica.addCountry(new Country("Argentina", new BigInteger("200000000")));
        northAmerica.addCountry(new Country("Paraguay", new BigInteger("150000000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        //When
        BigInteger actualPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(actualPeopleQuantity, new BigInteger("6700000000"));
        System.out.println("Actual number of people: " + actualPeopleQuantity);
        System.out.println("Expected number of people: " + new BigInteger("6700000000"));

    }
}
