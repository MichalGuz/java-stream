package com.stream.phone_number_creator;

import java.util.stream.IntStream;

public class PhoneNumberGenerator {
    public String generatePhoneNumber(int[] n) {
        if (n.length != 9) throw new IllegalArgumentException("Array must contain 9 integers!");
        for (int i: n){
            if (n[i]<0 || n[i]>9) throw new IllegalArgumentException("Array must contain only integers between 0-9.");
        }
        return String.format("(%d%d%d) %d%d%d-%d%d%d", IntStream.of(n).toArray());
    }

    public static void main(String[] args) {
        PhoneNumberGenerator p = new PhoneNumberGenerator();
    }
}
