package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Objects;

public class OrderRequest {
    private final Customer customer;
    private final Product product;
    private final LocalDate orderDate;

    public OrderRequest(final Customer customer, final Product product, final LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Product getProduct() {
        return this.product;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRequest)) return false;
        OrderRequest that = (OrderRequest) o;
        return Objects.equals(getCustomer(), that.getCustomer()) &&
                Objects.equals(getProduct(), that.getProduct()) &&
                Objects.equals(getOrderDate(), that.getOrderDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomer(), getProduct(), getOrderDate());
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", product=" + product +
                ", orderDate=" + orderDate +
                '}';
    }
}
