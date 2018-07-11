package com.kodilla.food2doors;

import java.util.Objects;

public class Customer {
    private final String customerName;
    private final String customerSurname;
    private final String customerAdress;

    public Customer(final String customerName, final String customerSurname, final String customerAdress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAdress = customerAdress;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerSurname() {
        return this.customerSurname;
    }

    public String getCustomerAdress() {
        return this.customerAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustomerName(), customer.getCustomerName()) &&
                Objects.equals(getCustomerSurname(), customer.getCustomerSurname()) &&
                Objects.equals(getCustomerAdress(), customer.getCustomerAdress());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomerName(), getCustomerSurname(), getCustomerAdress());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerAdress='" + customerAdress + '\'' +
                '}';
    }
}
