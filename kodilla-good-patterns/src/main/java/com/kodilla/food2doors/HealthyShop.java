package com.kodilla.food2doors;

public class HealthyShop implements Shop {

    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s, producer %s. Price: %s $, Quantity: %s, total order price: %s $";

    private OrderRequest orderRequest;
    private String producerName = "HealthyShop";

    public HealthyShop(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public double countOrderPrice() {
        return orderRequest.getQuantity() * orderRequest.getProduct().getProductPrice();
    }

    public boolean process() {
        if (this.orderRequest.getQuantity() < 5) {
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
        System.out.println("Product limit exceeded, order rejected");
        return false;
    }
}
