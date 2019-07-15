package com.stream.bigdecimal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity(){
        // given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Africa());
        continents.add(new Asia());
        continents.add(new Australia());

        // when
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent: continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }


        // then
        BigDecimal excpectedTotalSand = new BigDecimal("10099999999999993456731");
        Assert.assertEquals(excpectedTotalSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce(){

    }

}
