package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository {
    private static final String REPOSITORY_ORDER_DETAILS = "Order added to repository. Details: ordered by: %s %s. Product name: %s, price: %s. Ordering date: %s";

    public String createOrder(final Customer customer, final Product product, final LocalDate orderDate) {
        return String.format(REPOSITORY_ORDER_DETAILS,
                customer.getName(),
                customer.getSurname(),
                product.getProductName(),
                product.getPrice(),
                orderDate.toString());
    }
}
