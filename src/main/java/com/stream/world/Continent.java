package com.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    public List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }
}
