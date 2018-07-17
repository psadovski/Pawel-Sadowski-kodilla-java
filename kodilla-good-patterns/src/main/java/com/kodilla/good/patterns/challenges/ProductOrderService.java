package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {

        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct(),
                orderRequest.getOrderDate());

        if(isOrdered) {
            System.out.println(informationService.inform(orderRequest.getCustomer()));
            System.out.println(orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrderDate()));

            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}

