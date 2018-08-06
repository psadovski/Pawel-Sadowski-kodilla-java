package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class OrderDto {
    public final Order order;
    public final boolean isOrdered;

    public OrderDto(final Order order, final boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return this.order;
    }

    public boolean isOrdered() {
        return this.isOrdered;
    }
}
