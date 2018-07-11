package com.kodilla.food2doors;

import java.util.Objects;

public class GlutenFreeShop implements Order {
    private OrderRequest orderRequest;
    private String producerName = "GlutenFreeShop";

    public GlutenFreeShop(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public double countOrderPrice() {
        return orderRequest.getQuantity() * orderRequest.getProduct().getProductPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GlutenFreeShop)) return false;
        GlutenFreeShop that = (GlutenFreeShop) o;
        return Objects.equals(getOrderRequest(), that.getOrderRequest());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOrderRequest());
    }

    public boolean process() {
        System.out.println("Creating order for: " + this.orderRequest.getCustomer().getCustomerName() + " " + this.orderRequest.getCustomer().getCustomerSurname() + ", adress: " + this.orderRequest.getCustomer().getCustomerAdress() + ". Product: " + this.orderRequest.getProduct().getProductName() + ", producer " + producerName + ". Price: " + this.orderRequest.getProduct().getProductPrice() + " $ " + ", Quantity: " + this.orderRequest.getQuantity() + ", total order price: " + countOrderPrice() + " $.");

        return true;
    }
}
