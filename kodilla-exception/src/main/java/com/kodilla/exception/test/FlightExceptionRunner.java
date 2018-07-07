package com.kodilla.exception.test;

import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight = null;
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            for (Map.Entry<String, Boolean> entry : flightSearchEngine.findFlight(flight).entrySet()) {
                System.out.println("Flight to: " + entry.getKey()+" possible: "+entry.getValue());
            }

        } catch (RouteNotFoundException e) {
            System.out.println("Route not found...");
        }
    }
}

