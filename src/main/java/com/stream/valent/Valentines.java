package com.stream.valent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Valentines {
    public static void main(String[] args) {
        String mess = "chaosonicokchaosuoychaosevolchaosi";
        String[] splitted = mess.split("chaos");

        List<String> revealedTruth = new ArrayList<>();
        String element;


        for (int i = 0; i < splitted.length; i++) {
            String[] word = splitted[i].split("");
            for (int u = 0; u < word.length; u++) {
                element = word[u];
                revealedTruth.add(element);
            }
            revealedTruth.add(" ");
        }

        Collections.reverse(revealedTruth);
        for (String of : revealedTruth) {
            System.out.print(of.toUpperCase());
        }

        System.out.print("!!!");
    }
}
