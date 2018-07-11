package com.kodilla.food2doors;

public class OrderProcessor {
    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public void order(final OrderRequest orderRequest) {
        System.out.println("Welcome to food2doors application!");
        boolean isOrdered = this.order.process();

        if (isOrdered) {
            System.out.println("Order for: " + orderRequest.getCustomer().getCustomerName() + " " + orderRequest.getCustomer().getCustomerSurname() + ", adress: " + orderRequest.getCustomer().getCustomerAdress() + ", isOrdered: " + true);

        } else {
            System.out.println("Order for: " + orderRequest.getCustomer().getCustomerName() + " " + orderRequest.getCustomer().getCustomerSurname() + ", adress: " + orderRequest.getCustomer().getCustomerAdress() + ", isOrdered: " + false);
        }
    }
}
