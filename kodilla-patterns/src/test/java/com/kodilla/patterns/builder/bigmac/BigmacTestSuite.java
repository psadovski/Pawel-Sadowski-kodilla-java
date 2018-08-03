package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sezame")
                .burgers(3)
                .sauce("Garlic")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Prawns")
                .ingredient("Chilli Papper")
                .build();
        System.out.println(bigmac);

        //When & Then
        Assert.assertEquals(4, bigmac.getIngredients().size());
    }
}
