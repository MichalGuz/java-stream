package com.stream.beautifier;

public class MainBeautifier {
    public static void main(String[] args) {
        TextBeautifier textBeautifier = new TextBeautifier();

        textBeautifier.beautify("Some String", text -> "nAAAAAA " + text + " AAAAAA");
        textBeautifier.beautify("hello world", text -> text.toUpperCase());
        textBeautifier.beautify("join us!", text -> text.replace('j', 'c'));
        textBeautifier.beautify("STRING", text -> text.toLowerCase());
    }
}