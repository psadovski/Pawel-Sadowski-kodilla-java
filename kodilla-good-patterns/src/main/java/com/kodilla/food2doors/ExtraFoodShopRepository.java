package com.kodilla.food2doors;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopRepository {
    private final Map<Product, Integer> products;

    public ExtraFoodShopRepository() {
        this.products = new HashMap<>();
    }

    public void add(Product product, Integer quantity) {
        if (products.containsKey(product)) {
            this.products.put(product, products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }

    public void remove(Product product, Integer quantity) {
        if (products.containsKey(product)) {
            this.products.remove(product, quantity - products.get(product));
        }
    }

    public boolean check(Product product, Integer quantity) {
        return quantity >= 0 && this.products.containsKey(product) && this.products.get(product) >= quantity;
    }
}

