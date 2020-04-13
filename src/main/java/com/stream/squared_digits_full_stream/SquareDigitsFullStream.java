package com.stream.squared_digits_full_stream;

public class SquareDigitsFullStream {
    public int squareDigitsUsingStream(int n){
        return Integer.parseInt(String.valueOf(n)
        .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .
        );
    }
}
