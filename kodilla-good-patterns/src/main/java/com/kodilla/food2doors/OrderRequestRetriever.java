package com.kodilla.food2doors;

public class OrderRequestRetriever {

    public OrderRequest retrieveExtraFoodShopOrder() {
        Customer customer = new Customer("Tom", "Smith", "Lipowa 17 Boston");
        Product product = new Product("Cheeseburger", 4.50);
        int quantity = 2;

        return new OrderRequest(customer, product, quantity);
    }

    public OrderRequest retrieveGlutenFreeShopOrder() {
        Customer customer = new Customer("Alan", "Smith", "HighStreet 17 NewYork");
        Product product = new Product("Gluten-free Cheeseburger", 6.50);
        int quantity = 4;

        return new OrderRequest(customer, product, quantity);
    }

    public OrderRequest retrieveHealthyShopOrder() {
        Customer customer = new Customer("Jane", "Smith", "HighStreet 17 Las Vegas");
        Product product = new Product("Apple", 1.50);
        int quantity = 10;

        return new OrderRequest(customer, product, quantity);
    }
}
