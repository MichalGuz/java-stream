package com.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // given
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = i;
            i++;
        }

        // when
        double result = ArrayOperations.getAverage(numbers);

        // then
        Assert.assertEquals(2.5, result, 0.01);
    }
}
