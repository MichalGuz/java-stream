package com.non_stream_versions.squareDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigits {
    public static void main(String[] args) {
        Integer bigNumber = 321;
        System.out.println("Basic numbers: " + bigNumber);

        String numbers = String.valueOf(bigNumber);
        String[] digitsInArray = numbers.split("");
        List<Integer> digits2 = new ArrayList<>();
        List<Integer> digits3 = new ArrayList<>();


        for (int r = 0; r < digitsInArray.length; r++) {
            Integer in = Integer.parseInt(digitsInArray[r]);
            digits2.add(in);
            System.out.println(in);
            for (int sq = 0; sq < digits2.size(); sq++) {
                Integer dd = (digits2.get(sq)) * (digits2.get(sq));
                digits3.add(dd);
                System.out.println("dd " + dd);
            }
        }
    }
}
