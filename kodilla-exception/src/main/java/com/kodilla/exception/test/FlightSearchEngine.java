package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        if (flight != null) {
            Map<String, Boolean> airport = new HashMap<>();
            airport.put(flight.getArrivalAirport(), true);

        return airport;
        }

        throw new RouteNotFoundException("The object flight was null");
    }
}
