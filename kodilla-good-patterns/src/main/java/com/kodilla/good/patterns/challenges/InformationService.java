package com.kodilla.good.patterns.challenges;

public class InformationService {
    private static final String INFORMATION= "Sending SMS message to customer: %s %s.";

    public String inform(final Customer customer) {
        return String.format(INFORMATION, customer.getName(), customer.getSurname());
    }
}
