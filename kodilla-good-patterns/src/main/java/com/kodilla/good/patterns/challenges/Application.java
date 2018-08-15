package com.kodilla.good.patterns.challenges;

public class Application {
    public static void initRepository(ProductRepository productRepository) {
        productRepository.add(new Product("Telephone", 100), 20);
        productRepository.add(new Product("Computer", 800), 8);
        productRepository.add(new Product("Laptop", 700), 8);
        productRepository.add(new Product("Headphones", 20), 100);
    }
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        initRepository(productRepository);
        InformationService informationService = new InformationService();
        OrderService orderService = new OrderService(productRepository);
        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService);
        Customer customer = new Customer("Tom", "Smith");
        Order order = new Order(customer, new Product("Telephone", 100), 2);

        OrderDto orderDto = orderProcessor.process(order);
        System.out.println(informationService.inform(orderDto));
    }
}
