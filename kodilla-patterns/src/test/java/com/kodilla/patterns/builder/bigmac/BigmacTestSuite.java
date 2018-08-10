package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac actual = new Bigmac.BigmacBuilder()
                .bun("With sezame")
                .burgers(3)
                .sauce("Garlic")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Prawns")
                .ingredient("Chilli Papper")
                .build();

        //When
        List<String> ingredients = Arrays.asList("Cheese", "Onion", "Prawns", "Chilli Papper");
        Bigmac expected = new Bigmac("With sezame",3,"Garlic", ingredients);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
