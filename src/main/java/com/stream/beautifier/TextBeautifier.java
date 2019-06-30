package com.stream.beautifier;

public class TextBeautifier {
    public void beautify(String text, TextDecorator textDecorator){
        String decoratedText = textDecorator.decorate(text);
        System.out.println(decoratedText);
    }
}
