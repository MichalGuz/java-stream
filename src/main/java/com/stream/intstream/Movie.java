package com.stream.intstream;

public final class Movie {
    private final String title;
    private final int yearORelease;
    private final int lenghtInMinutes;

    public Movie(final  String title, final int yearORelease, final int lenghtInMinutes) {
        this.title = title;
        this.yearORelease = yearORelease;
        this.lenghtInMinutes = lenghtInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getYearORelease() {
        return yearORelease;
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }
}
