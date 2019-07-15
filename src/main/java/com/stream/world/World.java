package com.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World extends Country{
    List<Continent> continents = new ArrayList<>();

    @Override
    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeople = continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }

}
