package com.kodilla.good.patterns.airport;

import java.util.Objects;

public class FlightPair {
    private final Flight flightOne;
    private final Flight flightTwo;

    public FlightPair(final Flight flightOne, final Flight flightTwo) {
        this.flightOne = flightOne;
        this.flightTwo = flightTwo;
    }

    public Flight getFlightOne() {
        return this.flightOne;
    }

    public Flight getFlightTwo() {
        return this.flightTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightPair)) return false;
        FlightPair that = (FlightPair) o;
        return Objects.equals(getFlightOne(), that.getFlightOne()) &&
                Objects.equals(getFlightTwo(), that.getFlightTwo());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFlightOne(), getFlightTwo());
    }

    @Override
    public String toString() {
        return  "First flight: " + flightOne +
                ",change and second flight: " + flightTwo;
    }
}