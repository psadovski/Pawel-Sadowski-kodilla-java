package com.kodilla.good.patterns.airport;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private final List<Flight> flights;

    public FlightSearchEngine(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightFrom(String flightFrom) {
        return flights
                .stream()
                .filter(flight -> flight.getDeparture().equals(flightFrom))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsTo(String flightTo) {
        return flights
                .stream()
                .filter(flight -> flight.getArrival().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<Flight> search(String from, String to) {
        return flights
                .stream()
                .filter(flight -> flight.getDeparture().equals(from) && flight.getArrival().equals(to))
                .collect(Collectors.toList());
    }

    private List<FlightPair> getPairs(Flight from, List<Flight> to) {
        return to.stream()
                .map(f -> new FlightPair(from, f))
                .collect(Collectors.toList());
    }

    public List<FlightPair> searchWithChange(String from, String to) {
        List<Flight> flightOne = findFlightFrom(from);

        return flightOne.stream()
                .flatMap(f -> getPairs(f, search(f.getArrival(), to)).stream())
                .collect(Collectors.toList());
    }
}