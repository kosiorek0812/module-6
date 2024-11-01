package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final String name;
    private final List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }
    public List<Country> getCountries() {
        return countries;
    }
}
