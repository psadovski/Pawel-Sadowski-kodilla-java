package com.kodilla.food2doors;

public class HealthyShop implements Shop {

    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s, producer %s. Price: %s $, Quantity: %s, total order price: %s $";
    private static final int PRODUCT_LIMIT = 5;

    private OrderRequest orderRequest;
    private String producerName;

    public HealthyShop(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
        this.producerName = "HealthyShop";
    }

    public String getProducerName() {
        return this.producerName;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public double countOrderPrice() {
        return orderRequest.getQuantity() * orderRequest.getProduct().getProductPrice();
    }

    public boolean process() {
        if (this.orderRequest.getQuantity() < PRODUCT_LIMIT) {
            return true;
        }

        return false;
    }
}
