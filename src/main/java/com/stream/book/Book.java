package com.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearORelease;

    public Book(final String author, final String title, final int yearORelease) {
        this.author = author;
        this.title = title;
        this.yearORelease = yearORelease;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearORelease() {
        return yearORelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearORelease=" + yearORelease +
                '}';
    }
}

