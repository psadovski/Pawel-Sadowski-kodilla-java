package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Customer {
    private final String name;
    private final String surname;

    public Customer(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getSurname(), customer.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
