package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "IITEM")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column( name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return this.price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return this.quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return this.value;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

     public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                quantity == item.quantity &&
                Objects.equals(product, item.product) &&
                Objects.equals(price, item.price) &&
                Objects.equals(value, item.value) &&
                Objects.equals(invoice, item.invoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price, quantity, value, invoice);
    }

    @Override
    public String toString() {
        return "Item: " +
                "id = " + id +
                ", product = " + product +
                ", price = " + price +
                ", quantity = " + quantity +
                ", value = " + value +
                ", invoice = " + invoice;
    }
}
