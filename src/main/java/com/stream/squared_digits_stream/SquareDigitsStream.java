package com.stream.squared_digits_stream;

import java.util.Arrays;
import java.util.Optional;

public class SquareDigitsStream {
     public static void main(String[] args) {
         Integer bigNumber = 54321;
         System.out.println("Basic numbers: " + bigNumber);

         String numbers = String.valueOf(bigNumber);
         String[] digitsInArray = numbers.split("");

         Optional<String> total = Arrays.stream(digitsInArray)
                 .map(Integer::parseInt)
                 .map(i -> i*i)
                 .map(j -> j.toString(j))
                 .reduce((k, l) -> k + l);

         String squaredNumber = total.get();
     }
}