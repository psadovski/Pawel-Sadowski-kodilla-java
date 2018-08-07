package com.kodilla.food2doors;

import java.util.Objects;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private int quantity;

    public OrderRequest(Customer customer, Product product, int quantity) {
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
        if (!(o instanceof OrderRequest)) return false;
        OrderRequest that = (OrderRequest) o;
        return getQuantity() == that.getQuantity() &&
                Objects.equals(getCustomer(), that.getCustomer()) &&
                Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomer(), getProduct(), getQuantity());
    }
}
