package com.kodilla.good.patterns.challenges;

public class OrderService {
    private final ProductRepository productRepository;

    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean order(Order order) {
        if (productRepository.check(order.getProduct(), order.getQuantity())) {
            productRepository.remove(order.getProduct(), order.getQuantity());
            return true;
        } else {
            return false;
        }
    }
}
