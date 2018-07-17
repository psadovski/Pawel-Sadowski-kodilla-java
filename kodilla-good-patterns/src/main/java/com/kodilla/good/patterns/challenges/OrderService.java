package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderService {
    private static final String ORDER_DETAILS = "Ordered by: %s %s. Product name: %s, price: %s. Ordering date: %s";

    public boolean order(final Customer customer, final Product product, final LocalDate orderDate) {
        System.out.println(String.format(ORDER_DETAILS,
                customer.getName(),
                customer.getSurname(),
                product.getProductName(),
                product.getPrice(),
                orderDate.toString()));

        return true;
    }
}
