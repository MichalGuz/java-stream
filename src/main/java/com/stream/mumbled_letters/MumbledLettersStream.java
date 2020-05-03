package com.stream.mumbled_letters;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Write function accumWithStream().
//  Examples:
//      accum("abcd") -> "A-Bb-Ccc-Dddd"
//      accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//      accum("cwAt") -> "C-Ww-Aaa-Tttt"

public class MumbledLettersStream {
    public static String accumWithStream(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> Stream.generate(() -> s.charAt(i)).limit(i+1).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString())
                .map(j -> j.substring(0,1).toUpperCase() + j.substring(1).toLowerCase())
                .collect(Collectors.joining("-"));
    }
}
