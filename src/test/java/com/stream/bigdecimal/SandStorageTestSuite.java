package com.stream.bigdecimal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity(){
        // given
        List<SandStorage> continents= new ArrayList<>();
        continents.add(new Africa());
        continents.add(new Asia());
        continents.add(new Australia());
    }

}
