package com.kodilla.good.patterns.airport;

import org.junit.Test;

public class FlightSearchEngineTestSuite {
    @Test
    public void testFindFlightFrom() {
        //Given
        FlightInitializer flights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flights.initFlights());

        //When and Then
        System.out.println("Flights from Gdansk:");
        System.out.println(flightSearchEngine.findFlightFrom("Gdansk"));
    }

    @Test
    public void testFindFlightTo() {
        //Given
        FlightInitializer flights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flights.initFlights());

        //When and Then
        System.out.println("Flights from Warszawa:");
        System.out.println(flightSearchEngine.findFlightsTo("Warszawa"));
    }

    @Test
    public void testSearchWithChange() {
        //Given
        FlightInitializer flights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flights.initFlights());

        //When and Then
        System.out.println("Flights with change from Warszawa to Krakow");
        System.out.println(flightSearchEngine.searchWithChange("Warszawa", "Krakow"));
    }
}