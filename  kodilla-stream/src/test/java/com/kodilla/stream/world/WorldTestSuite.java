package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void getPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("70000000")));
        europe.addCountry(new Country("France", new BigDecimal("70000000")));

        Continent america = new Continent("North America");
        america.addCountry(new Country("United States", new BigDecimal("150000000")));
        america.addCountry(new Country("Mexico", new BigDecimal("130000000")));
        america.addCountry(new Country("Canada", new BigDecimal("90000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1500000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("200000000")));
        asia.addCountry(new Country("India", new BigDecimal("1200000000")));


        World world = new World();

        world.addContinent(europe);
        world.addContinent(america);
        world.addContinent(asia);


        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3448000000");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
