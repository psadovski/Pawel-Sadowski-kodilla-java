package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{
    private static final String BASICPIZZA = "Ordered pizza: Margharita(cheese and tomato sauce)";

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return BASICPIZZA;
    }
}
