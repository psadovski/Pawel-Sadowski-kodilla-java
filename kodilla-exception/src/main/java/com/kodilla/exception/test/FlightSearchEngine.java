package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearchEngine {
    private Map<String, Boolean> flightsMap;
    private static final String FLIGHT_INFORMATION = "Flight from: %s to: %s is avaiable";

    public FlightSearchEngine(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public Map<String, Boolean> getFlightsMap() {
        return flightsMap;
    }

    public void  findFlight(Flight flight) throws RouteNotFoundException {
        if (getFlightsMap().containsKey(flight.getArrivalAirport())) {
            System.out.println(String.format(FLIGHT_INFORMATION, flight.getDepartureAirport(), flight.getArrivalAirport()));
        }

        throw new RouteNotFoundException("Sorry, there is no flight found!");
    }
}
