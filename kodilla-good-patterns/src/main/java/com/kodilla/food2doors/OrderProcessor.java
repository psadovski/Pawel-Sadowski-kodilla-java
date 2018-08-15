package com.kodilla.food2doors;

public class OrderProcessor {
    private Shop shop;

    public OrderProcessor(Shop order) {
        this.shop = order;
    }

    public OrderDTO order(final OrderRequest orderRequest) {
        boolean isOrdered = this.shop.process();

        return new OrderDTO(orderRequest, isOrdered);
    }
}
