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

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(p -> p.length() > 11)
                .map(p -> p.substring(0, p.indexOf(' ') + 2) + ".")
                .filter(p -> p.substring(0, 1).equals("A"))
                .forEach(System.out::println);
    }
}
