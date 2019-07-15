package com.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    public List<Country> countries = new ArrayList<>();

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}
