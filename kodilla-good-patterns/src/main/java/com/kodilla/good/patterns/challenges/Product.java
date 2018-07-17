package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Product {
    private final String productName;
    private final double price;

    public Product(final String productName, final double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
