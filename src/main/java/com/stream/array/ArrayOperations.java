package com.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(n));

        double average = IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();

        return average;
    }
}
