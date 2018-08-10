package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Order {
    private final Customer customer;
    private final Product product;
    private final int quantity;

    public Order(final Customer customer, final Product product, final int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order that = (Order) o;
        return Objects.equals(getCustomer(), that.getCustomer()) &&
                Objects.equals(getProduct(), that.getProduct()) &&
                Objects.equals(getQuantity(), that.getQuantity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomer(), getProduct(), getQuantity());
    }

    @Override
    public String toString() {
        return "Created order for customer: " + customer +
                ", product: " + product +
                ", quantity: " + quantity;
    }
}
