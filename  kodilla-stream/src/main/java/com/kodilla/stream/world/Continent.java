package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public String getContinentName() {
        return this.continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(getContinentName(), continent.getContinentName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getContinentName());
    }
}
