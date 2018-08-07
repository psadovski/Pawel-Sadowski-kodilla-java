package com.kodilla.food2doors;

public class ExtraFoodShop implements Shop {

    private static final String ORDER_CREATOR_INFO = "Creating order for: %s %s , adress: %s. Product: %s, producer %s. Price: %s $, Quantity: %s, total order price: %s $";

    private OrderRequest orderRequest;
    private ExtraFoodShopRepository extraFoodShopRepository;
    private String producerName = "ExtraFoodShop";

    public ExtraFoodShop(OrderRequest orderRequest, ExtraFoodShopRepository extraFoodShopRepository) {
        this.orderRequest = orderRequest;
        this.extraFoodShopRepository = extraFoodShopRepository;
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
