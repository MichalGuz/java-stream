package com.stream.book;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class BookMain {
    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();
        bookDirectory.getList().stream()
                .filter(book -> book.getYearORelease() > 2010)
                .forEach(System.out::println);

        List<Book> theResultList = bookDirectory.getList().stream()
                .filter(book -> book.getYearORelease() >2010)
                .collect(Collectors.toList())

    }
}
