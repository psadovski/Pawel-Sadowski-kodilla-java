package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(Order order) {
        boolean isOrdered = orderService.order(order);
        System.out.println(informationService.inform(order, isOrdered));
        return new OrderDto(order, isOrdered);
    }
}
