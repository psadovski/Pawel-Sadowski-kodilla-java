package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ProductService productService;
    private final List<Item> items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService = productService;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item: items) {
            sum = sum.add(productService.getPrice(item.getProductId()).multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void setVerified(boolean verified) {
        this.isVerified = verified;
    }

    public boolean isSubmitted() {
        return this.isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        this.isSubmitted = submitted;
    }
}
