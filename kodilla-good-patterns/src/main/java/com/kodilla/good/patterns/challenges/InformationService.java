package com.kodilla.good.patterns.challenges;

public class InformationService {
    private static final String INFORMATION = "Created order for customer: %s, product: %s, price: %s, quantity: %s, total price: %s";

    public String inform(Order order, boolean isOrdered) {
        if (isOrdered) {
           return String.format(INFORMATION,
                    order.getCustomer(),
                    order.getProduct().getProductName(),
                    order.getProduct().getPrice(),
                    order.getQuantity(),
                    order.getQuantity() * order.getProduct().getPrice());
        }
        return "No order created";
    }
}
