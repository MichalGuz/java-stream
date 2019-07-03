package com.stream.book;

public class BookMain {
    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();
        bookDirectory.getList().stream()
                .filter(book -> book.getYearORelease() > 2010)
                .forEach(System.out::println);

    }
}
