package com.stream.person;

public class PersonMain {
    public static void main(String[] args) {
        People.getList().stream()
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);

        // the same results in other way,
        // you can change lambda expression to method reference
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(p -> System.out.println(p));
    }
}
