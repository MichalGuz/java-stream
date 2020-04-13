package com.stream.squared_digits_full_stream;

import java.util.stream.Collectors;

public class SquareDigitsFullStream {
    public int squareDigitsUsingStream(int n){
        return Integer.parseInt(String.valueOf(n)
        .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
        );
    }
}
