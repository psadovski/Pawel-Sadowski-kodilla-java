package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository {
    public void createOrder(final Customer customer, final Product product, final LocalDate orderDate) {
        System.out.println("Order added to repository. Details: ordered by: " + customer.getName() + " " + customer.getSurname() + ". Product name: " + product.getProductName() + " price: " + product.getPrice() + ". Ordering date: " + orderDate.toString());

    }
}
