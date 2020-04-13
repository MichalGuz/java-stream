package com.stream.squared_digits_full_stream;

public class SquareDigitsFullStreamMain {
    public static void main(String[] args) {
        SquareDigitsFullStream s = new SquareDigitsFullStream();
        int result = s.squareDigitsUsingStream(123405);
        System.out.println("Squared digits = " + result);
    }
}
