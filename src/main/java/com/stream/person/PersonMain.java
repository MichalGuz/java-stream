package com.stream.person;

public class PersonMain {
    public static void main(String[] args) {
        People.getList().stream()
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);
    }
}
