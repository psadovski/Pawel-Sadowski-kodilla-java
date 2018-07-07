package com.kodilla.good.patterns.challenges;

public class InformationService {
    public void inform(final Customer customer) {
        System.out.println("Sending SMS message to customer: " + customer.getName() + " " + customer.getSurname());
    }
}
