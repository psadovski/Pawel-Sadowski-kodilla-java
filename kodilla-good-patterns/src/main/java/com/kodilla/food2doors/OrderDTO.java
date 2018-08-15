package com.kodilla.food2doors;

public class OrderDTO {
    public final OrderRequest orderRequest;
    public final boolean isOrdered;

    public OrderDTO(final OrderRequest orderRequest, final boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    public boolean isOrdered() {
        return this.isOrdered;
    }
}
