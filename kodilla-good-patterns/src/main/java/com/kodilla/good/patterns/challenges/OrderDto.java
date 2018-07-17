package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class OrderDto {
    public final Customer customer;
    public final boolean isOrdered;

    public OrderDto(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public boolean isOrdered() {
        return this.isOrdered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDto)) return false;
        OrderDto orderDto = (OrderDto) o;
        return isOrdered() == orderDto.isOrdered() &&
                Objects.equals(getCustomer(), orderDto.getCustomer());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomer(), isOrdered());
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "customer=" + customer +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
