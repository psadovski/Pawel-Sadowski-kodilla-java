package com.kodilla.food2doors;

import com.kodilla.good.patterns.challenges.OrderDto;

public class InformationService {

    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s. Price: %s $, Quantity: %s, total order price: %s $";
    private static final String REJECTION_INFORMATION = "Order rejected.";
    private static final String ORDER = "Order for %s %s , adress: %s, isOrdered: %s";

    public String orderCreationInform(OrderDTO orderDTO) {
        OrderRequest orderRequest = orderDTO.getOrderRequest();

        System.out.println("Welcome to food2doors application");

        if (orderDTO.isOrdered) {
            return String.format(ORDER_CREATOR_INFO,
                    orderRequest.getCustomer().getCustomerName(),
                    orderRequest.getCustomer().getCustomerSurname(),
                    orderRequest.getCustomer().getCustomerAdress(),
                    orderRequest.getProduct().getProductName(),
                    orderRequest.getProduct().getProductPrice(),
                    orderRequest.getQuantity(),
                    orderRequest.getProduct().getProductPrice() * orderRequest.getQuantity());
        } else {
            return REJECTION_INFORMATION;
        }
    }

    public String orderInform(OrderDTO orderDTO) {
        OrderRequest orderRequest = orderDTO.getOrderRequest();

        if (orderDTO.isOrdered) {
            return String.format(ORDER,
                    orderRequest.getCustomer().getCustomerName(),
                    orderRequest.getCustomer().getCustomerSurname(),
                    orderRequest.getCustomer().getCustomerAdress(),
                    true);
        } else {
            return String.format(ORDER,
                    orderRequest.getCustomer().getCustomerName(),
                    orderRequest.getCustomer().getCustomerSurname(),
                    orderRequest.getCustomer().getCustomerAdress(),
                    false);
        }
    }
}
