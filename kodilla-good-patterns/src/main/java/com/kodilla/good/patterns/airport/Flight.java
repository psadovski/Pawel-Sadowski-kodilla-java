package com.kodilla.good.patterns.airport;

import java.util.Objects;

public class Flight {
    private final String departure;
    private final String arrival;

    public Flight(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDeparture(), flight.getDeparture()) &&
                Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDeparture(), getArrival());
    }

    @Override
    public String toString() {
        return getDeparture() + " -> " + getArrival();
    }
}