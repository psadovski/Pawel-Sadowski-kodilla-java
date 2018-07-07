package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Tom", "Smith");
        Product product = new Product("Computer", 5000.00);
        LocalDate orderDate = LocalDate.of(2018, 1, 13);

        return new OrderRequest(customer, product, orderDate);
    }
}
