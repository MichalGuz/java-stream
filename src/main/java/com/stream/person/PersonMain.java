package com.stream.person;

public class PersonMain {
    public static void main(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);
    }
}
