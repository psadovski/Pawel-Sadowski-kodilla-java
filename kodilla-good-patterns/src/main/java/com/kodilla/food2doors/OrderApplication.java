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
        InformationService informationService = new InformationService();

        OrderRequest orderRequestExtraFoodShop = orderRequestRetriever.retrieveExtraFoodShopOrder();
        OrderRequest orderRequestGlutenFreeShop = orderRequestRetriever.retrieveGlutenFreeShopOrder();
        OrderRequest orderRequestHealthyShop = orderRequestRetriever.retrieveHealthyShopOrder();

        OrderProcessor orderFromExtraFoodShop = new OrderProcessor(new ExtraFoodShop(orderRequestExtraFoodShop, extraFoodShopRepository));
        OrderProcessor orderFromGlutenFreeShop = new OrderProcessor(new GlutenFreeShop(orderRequestGlutenFreeShop));
        OrderProcessor orderFromHealthyShop = new OrderProcessor(new HealthyShop(orderRequestHealthyShop));

        OrderDTO orderDtoExtraFoodShop = orderFromExtraFoodShop.order(orderRequestExtraFoodShop);
        System.out.println(informationService.orderCreationInform(orderDtoExtraFoodShop));
        System.out.println(informationService.orderInform(orderDtoExtraFoodShop));

        OrderDTO orderDtoGlutenFreeShop = orderFromGlutenFreeShop.order(orderRequestGlutenFreeShop);
        System.out.println(informationService.orderCreationInform(orderDtoGlutenFreeShop));
        System.out.println(informationService.orderInform(orderDtoGlutenFreeShop));

        OrderDTO orderDtoHealthyShop = orderFromHealthyShop.order(orderRequestHealthyShop);
        System.out.println(informationService.orderCreationInform(orderDtoHealthyShop));
        System.out.println(informationService.orderInform(orderDtoHealthyShop));
    }
}
