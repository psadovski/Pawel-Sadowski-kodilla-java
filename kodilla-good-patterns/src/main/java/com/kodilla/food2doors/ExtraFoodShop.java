package com.kodilla.food2doors;

public class ExtraFoodShop implements Shop {

    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s, producer %s. Price: %s $, Quantity: %s, total order price: %s $";

    private OrderRequest orderRequest;
    private ExtraFoodShopRepository extraFoodShopRepository;
    private String producerName;

    public ExtraFoodShop(OrderRequest orderRequest, ExtraFoodShopRepository extraFoodShopRepository) {
        this.orderRequest = orderRequest;
        this.extraFoodShopRepository = extraFoodShopRepository;
        this.producerName = "ExtraFoodShop";
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
        if (extraFoodShopRepository.check(orderRequest.getProduct(), orderRequest.getQuantity())) {
            extraFoodShopRepository.remove(orderRequest.getProduct(), orderRequest.getQuantity());
            return true;
        }

        return false;
    }
}
