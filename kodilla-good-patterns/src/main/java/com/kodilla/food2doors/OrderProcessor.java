package com.kodilla.food2doors;

public class OrderProcessor {
    private Shop shop;
    private static final String ORDER = "Order for %s %s , adress: %s, isOrdered: %s";

    public OrderProcessor(Shop order) {
        this.shop = order;
    }

    public void order(final OrderRequest orderRequest) {
        System.out.println("Welcome to food2doors application!");
        boolean isOrdered = this.shop.process();

        if (isOrdered) {
            System.out.println(String.format(ORDER,
                    orderRequest.getCustomer().getCustomerName(),
                    orderRequest.getCustomer().getCustomerSurname(),
                    orderRequest.getCustomer().getCustomerAdress(),
                    true));
        } else {
            System.out.println(String.format(ORDER,
                    orderRequest.getCustomer().getCustomerName(),
                    orderRequest.getCustomer().getCustomerSurname(),
                    orderRequest.getCustomer().getCustomerAdress(),
                    false));
        }
    }
}
