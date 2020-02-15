package com.stream.squared_digits_stream;

public class SquareDigitsStream {
     public static void main(String[] args) {
         Integer bigNumber = 54321;
         System.out.println("Basic numbers: " + bigNumber);

         String numbers = String.valueOf(bigNumber);
         String[] digitsInArray = numbers.split("");
     }
}