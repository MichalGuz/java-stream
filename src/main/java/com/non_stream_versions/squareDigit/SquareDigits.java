package com.non_stream_versions.squareDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigits {
    public static void main(String[] args) {
        Integer bigNumber = 321;
        System.out.println("Basic numbers: " + bigNumber);

        String numbers = String.valueOf(bigNumber);
        String[] digitsInArray = numbers.split("");
        List<Integer> listOfdigits = new ArrayList<>();

        String joined = "";

        for (int i = 0; i < digitsInArray.length; i++) {
            Integer in = Integer.parseInt(digitsInArray[i]);
            listOfdigits.add(in);
            System.out.println(in);
        }

        for (int j = 0; j < listOfdigits.size(); j++) {
            Integer sq = (listOfdigits.get(j)) * (listOfdigits.get(j));
            System.out.println("dd " + sq);
        }
    }
}
