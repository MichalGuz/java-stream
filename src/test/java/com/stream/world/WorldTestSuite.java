package com.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // given
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("38000000")));
        europe.add(new Country("Germany", new BigDecimal("81000000")));
        europe.add(new Country("France", new BigDecimal("65000000")));
        europe.add(new Country("Italy", new BigDecimal("60000000")));

        List<Country> asia = new ArrayList<>();
        asia.add(new Country("Israel", new BigDecimal("22000000")));
        asia.add(new Country("Japan", new BigDecimal("127000000")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent(europe));
        continents.add(new Continent(asia));

        // when
        BigDecimal temp = BigDecimal.ZERO;
        World world = new World("planet", temp, continents);
        BigDecimal totalPeople = world.getPeopleQuantity();

        // then
        BigDecimal expected = new BigDecimal("393000000");
        Assert.assertEquals(expected, totalPeople);

    }
}
