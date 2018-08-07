package com.kodilla.food2doors;

public class OrderApplication {
    public static void initRepository(ExtraFoodShopRepository extraFoodShopRepository) {
        extraFoodShopRepository.add(new Product("Cheeseburger", 4.50), 20);
        extraFoodShopRepository.add(new Product("Double cheeseburger", 5.20), 15);
        extraFoodShopRepository.add(new Product("Hamburger", 3.90), 4);
        extraFoodShopRepository.add(new Product("Fishburger", 5.0), 30);
    }
    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ExtraFoodShopRepository extraFoodShopRepository = new ExtraFoodShopRepository();
        initRepository(extraFoodShopRepository);

        OrderRequest orderRequestExtraFoodShop = orderRequestRetriever.retrieveExtraFoodShopOrder();
        OrderRequest orderRequestGlutenFreeShop = orderRequestRetriever.retrieveGlutenFreeShopOrder();
        OrderRequest orderHealthyShop = orderRequestRetriever.retrieveHealthyShopOrder();

        OrderProcessor orderFromExtraFoodShop = new OrderProcessor(new ExtraFoodShop(orderRequestExtraFoodShop, extraFoodShopRepository));
        OrderProcessor orderFromGlutenFreeShop = new OrderProcessor(new GlutenFreeShop(orderRequestGlutenFreeShop));
        OrderProcessor orderFromHealthyShop = new OrderProcessor(new HealthyShop(orderHealthyShop));

        orderFromExtraFoodShop.order(orderRequestExtraFoodShop);
        orderFromGlutenFreeShop.order(orderRequestGlutenFreeShop);
        orderFromHealthyShop.order(orderHealthyShop);
    }
}
