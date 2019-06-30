package com.stream.beautifier;

public class TextBeautifier {
    public String beautify(String text, TextDecorator textDecorator){
        String decoratedText = textDecorator.decorate(text);
        System.out.println(decoratedText);
        return decoratedText;
    }

}
