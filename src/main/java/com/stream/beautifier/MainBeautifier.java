package com.stream.beautifier;

public class MainBeautifier {
    public static void main(String[] args) {
        TextBeautifier textBeautifier = new TextBeautifier();

        textBeautifier.beautify("Some String", text -> "nAAAAAA " + text + " AAAAAA");

    }
}