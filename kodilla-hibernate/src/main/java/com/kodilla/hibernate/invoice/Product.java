package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;
    private List<Item> items;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(items, product.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, items);
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = " + id +
                ", name = " + name +
                ", items = " + items;
    }
}
