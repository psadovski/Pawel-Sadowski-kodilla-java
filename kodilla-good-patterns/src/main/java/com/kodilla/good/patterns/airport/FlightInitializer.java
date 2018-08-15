package com.kodilla.good.patterns.airport;

import java.util.ArrayList;
import java.util.List;

public class FlightInitializer {
    public List<Flight> initFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdansk", "Wrocław"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Gdansk", "Warszawa"));
        flights.add(new Flight("Krakow", "Wrocław"));
        flights.add(new Flight("Krakow", "Warszawa"));
        flights.add(new Flight("Krakow", "Rzeszow"));
        flights.add(new Flight("Warszawa", "Krakow"));
        flights.add(new Flight("Warszawa", "Gdansk"));
        flights.add(new Flight("Warszawa", "Wroclaw"));

        return flights;
    }
}
