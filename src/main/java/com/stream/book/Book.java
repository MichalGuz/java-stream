package com.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfRelease;

    public Book(final String author, final String title, final int yearOfRelease) {
        this.author = author;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

