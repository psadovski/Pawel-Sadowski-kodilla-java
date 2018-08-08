package com.kodilla.good.patterns.challenges;

public class InformationService {
    private static final String ORDER_INFORMATION = "Created order for customer: %s, product: %s, price: %s, quantity: %s, total price: %s.";
    private static final String REJECTION_INFORMATION = "No order created.";

    public String inform(OrderDto orderDto) {
        if (orderDto.isOrdered()) {
            Order order = orderDto.getOrder();

            return String.format(ORDER_INFORMATION,
                    order.getCustomer(),
                    order.getProduct().getProductName(),
                    order.getProduct().getPrice(),
                    order.getQuantity(),
                    order.getQuantity() * order.getProduct().getPrice());
        }
        return REJECTION_INFORMATION;
    }
}
