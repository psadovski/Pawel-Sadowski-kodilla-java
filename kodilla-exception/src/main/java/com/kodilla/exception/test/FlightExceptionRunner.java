package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Chopin", "Luton");

        try {
            Map<String, Boolean> flightsMap = new HashMap<>();
            flightsMap.put("Luton", true);
            flightsMap.put("Tempelhoff", true);
            flightsMap.put("Hammamet", true);
            flightsMap.put("Oslo", true);

            FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightsMap);
            flightSearchEngine.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}

