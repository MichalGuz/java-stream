package com.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory{
    private final List<Book> bookList = new ArrayList<>();

    public BookDirectory(){
        bookList.add(new Book("Author1", "Book1", 2003));
        bookList.add(new Book("Author2", "Book2", 2013));
        bookList.add(new Book("Author3", "Book3", 2014));
        bookList.add(new Book("Author4", "Book4", 1999));
        bookList.add(new Book("Author5", "Book5", 2001));
        bookList.add(new Book("Author6", "Book6", 2004));
        bookList.add(new Book("Author7", "Book7", 1995));
    }
}
