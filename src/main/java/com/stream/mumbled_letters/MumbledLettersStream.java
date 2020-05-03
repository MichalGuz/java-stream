package com.stream.mumbled_letters;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MumbledLettersStream {
    public static String accumWithStream(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> Stream.generate(() -> s.charAt(i)).limit(i+1))

    }
}
