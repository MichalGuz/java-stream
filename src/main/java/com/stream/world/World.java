package com.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World extends Country{
    List<Continent> continents = new ArrayList<>();

    @Override
    public BigDecimal getPeopleQuantity(BigDecimal peopleQuantity){
        return peopleQuantity;
    }

}
