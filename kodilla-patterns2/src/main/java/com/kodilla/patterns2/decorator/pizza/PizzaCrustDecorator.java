package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.Random;

public class PizzaCrustDecorator extends AbstractPizzaOrderDecorator {
    public PizzaCrustDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    Random generator = new Random();
    int crust = generator.nextInt(4) + 1;

    @Override
    public BigDecimal getCost() {
        switch (crust) {
            case 1:
                return super.getCost().add(new BigDecimal(1));
            case 2:
                return super.getCost().add(new BigDecimal(3));
            case 3:
                return super.getCost().add(new BigDecimal(4));
            default:
                return  super.getCost().add(new BigDecimal(0));
        }
    }

    @Override
    public String getDescription() {
        switch (crust) {
            case 1:
                return super.getDescription() + " + thin crust";
            case 2:
                return super.getDescription() + " + extra - thin crust";
            case 3:
                return super.getDescription() + " + thick crust";
            default:
                return super.getDescription() + " + normal crust";
        }
    }
}
