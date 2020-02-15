package com.non_stream_versions.squareDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigits {
    public static void main(String[] args) {
        Integer bigNumber = 321;
        System.out.println("Basic numbers: " + bigNumber);

        String numbers = String.valueOf(bigNumber);
        String[] digitsInArray = numbers.split("");

        String joined = "";

        for (int i = 0; i < digitsInArray.length; i++) {
            Integer in = Integer.parseInt(digitsInArray[i]);
            Integer squared = in * in;
            String squaredString = Integer.toString(squared);
            joined = joined + squaredString;
        }

        Integer squaredNumbers = Integer.parseInt(joined);
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
