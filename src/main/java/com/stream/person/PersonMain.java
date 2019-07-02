package com.stream.person;

public class PersonMain {
    public static void main(String[] args) {

        // use the map() method
        People.getList().stream()
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);

        // the same results in other way,
        // you can change lambda expression to method reference
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(p -> System.out.println(p));

        // use the filter() method
        People.getList().stream()
                .filter(p -> p.length() > 11)
                .forEach(System.out::println);
    }
}
