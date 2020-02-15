package com.non_stream_versions.square_digit;

public class SquareDigits {
    public static void main(String[] args) {
        Integer bigNumber = 54321;
        System.out.println("Basic numbers: " + bigNumber);

        String numbers = String.valueOf(bigNumber);
        String[] digitsInArray = numbers.split("");

        String joined = "";

        for (String str: digitsInArray) {
            Integer in = Integer.parseInt(str);
            Integer squared = in * in;
            String squaredString = Integer.toString(squared);
            joined = joined + squaredString;
        }

        Integer squaredNumbers = Integer.parseInt(joined);
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
