package com.kodilla.patterns2;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.MeatDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaCrustDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import com.kodilla.patterns2.decorator.pizza.VegetablesDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    private static final String BASICPIZZA = "Ordered pizza: Margharita(cheese and tomato sauce)";
    private static final String CHEESE = " + extra cheese";
    private static final String MEAT = " + ham and sausage";
    private static final String VEGETABLES = " + onion, garlic and corn";


    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String actual = theOrder.getDescription();
        String expected = BASICPIZZA;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testPizzaOrderWithCrustGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaCrustDecorator(theOrder);

        //When and Then
        BigDecimal calculatedCost = theOrder.getCost();
        System.out.println(calculatedCost);
    }

    @Test
    public void testPizzaOrderWithCrustGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When and Then
        String description = theOrder.getDescription();
        System.out.println(description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndMeatGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(23), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndMeatGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);

        //When
        String actual = theOrder.getDescription();
        String expected = BASICPIZZA + CHEESE + MEAT;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseMeatAndVegetablesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseMeatAndVegetablesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);

        //When
        String actual = theOrder.getDescription();
        String expected = BASICPIZZA + CHEESE + MEAT + VEGETABLES;

        //Then
        assertEquals(expected, actual);
    }
}
