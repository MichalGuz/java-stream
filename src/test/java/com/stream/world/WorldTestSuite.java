package com.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        // given
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("38000000")));
        europe.add(new Country("Germany", new BigDecimal("81000000")));
        europe.add(new Country("France", new BigDecimal("65000000")));
        europe.add(new Country("Italy", new BigDecimal("60000000")));
}
