package com.kodilla.food2doors;

public class OrderApplication {
    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderRequest orderRequestExtraFoodShop = orderRequestRetriever.retrieveExtraFoodShop();
        OrderRequest orderRequestGlutenFreeShop = orderRequestRetriever.retrieveGlutenFreeShop();
        OrderRequest orderHealthyShop = orderRequestRetriever.retrieveHealthyShop();

        OrderProcessor orderFromExtraFoodShop = new OrderProcessor(new ExtraFoodShop(orderRequestExtraFoodShop));
        OrderProcessor orderFromGlutenFreeShop = new OrderProcessor(new GlutenFreeShop(orderRequestGlutenFreeShop));
        OrderProcessor orderFromHealthyShop = new OrderProcessor(new HealthyShop(orderHealthyShop));


        orderFromExtraFoodShop.order(orderRequestExtraFoodShop);
        orderFromGlutenFreeShop.order(orderRequestGlutenFreeShop);
        orderFromHealthyShop.order(orderHealthyShop);
    }
}
