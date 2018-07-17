package com.kodilla.food2doors;

import java.util.Objects;

public class ExtraFoodShop implements Shop {
    private OrderRequest orderRequest;
    private String producerName = "ExtraFoodShop";
    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s, producer %s. Price: %s $, Quantity: %s, total order price: %s $";

    public ExtraFoodShop(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public double countOrderPrice() {
        return orderRequest.getQuantity() * orderRequest.getProduct().getProductPrice();
    }

    public boolean process() {
        System.out.println(String.format(ORDER_CREATOR_INFO,
                this.orderRequest.getCustomer().getCustomerName(),
                this.orderRequest.getCustomer().getCustomerSurname(),
                this.orderRequest.getCustomer().getCustomerAdress(),
                this.orderRequest.getProduct().getProductName(),
                producerName,
                this.orderRequest.getProduct().getProductPrice(),
                this.orderRequest.getQuantity(),
                countOrderPrice()));

        return true;
    }
}
