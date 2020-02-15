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

        for (int r = 0; r < digitsInArray.length; r++) {
            Integer in = Integer.parseInt(digitsInArray[r]);
            listOfdigits.add(in);
            System.out.println(in);
            for (int sq = 0; sq < listOfdigits.size(); sq++) {
                Integer dd = (listOfdigits.get(sq)) * (listOfdigits.get(sq));
                System.out.println("dd " + dd);
            }
        }
    }
}
