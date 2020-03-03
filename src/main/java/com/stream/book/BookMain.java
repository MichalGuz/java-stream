package com.stream.book;

import java.util.List;
import java.util.stream.Collectors;

public class BookMain {
    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();
        bookDirectory.getList().stream()
                .filter(book -> book.getYearOfRelease() > 2010)
                .forEach(System.out::println);

        List<Book> theResultList = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfRelease() >2000)
                .collect(Collectors.toList());

        System.out.println("Elements in the list: " + theResultList.size());
        theResultList.stream()
                .forEach(System.out::println);

    }
}
