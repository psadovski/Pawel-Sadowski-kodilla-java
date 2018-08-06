package com.kodilla.good.patterns.airport;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchEngineTestSuite {
    @Test
    public void testFindFlightFrom() {
        //Given
        FlightInitializer initializedFlights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(initializedFlights.initFlights());

        //When
        List<Flight> actual = flightSearchEngine.findFlightFrom("Gdansk");
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Gdansk", "Wrocław"));
        expected.add(new Flight("Gdansk", "Krakow"));
        expected.add(new Flight("Gdansk", "Warszawa"));

        //Then
        Assert.assertEquals(expected.size(), actual.size());
    }

    @Test
    public void testFindFlightTo() {
        //Given
        FlightInitializer initializedFlights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(initializedFlights.initFlights());

        //When
        List<Flight> actual = flightSearchEngine.findFlightsTo("Warszawa");
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Gdansk", "Warszawa"));
        expected.add(new Flight("Krakow", "Warszawa"));

        //Then
        Assert.assertEquals(expected.size(), actual.size());
    }

    @Test
    public void testSearchWithChange() {
        //Given
        FlightInitializer initializedFlights = new FlightInitializer();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(initializedFlights.initFlights());

        //When
        List<FlightPair> actual = flightSearchEngine.searchWithChange("Warszawa", "Krakow");
        List<FlightPair> expected = new ArrayList<>();
        expected.add(new FlightPair(new Flight("Warszawa", "Gdansk"), new Flight("Gdansk", "Krakow")));

        //Then
        Assert.assertEquals(expected.size(), actual.size());
    }
}