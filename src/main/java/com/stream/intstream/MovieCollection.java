package com.stream.intstream;

import java.util.ArrayList;
import java.util.List;

public final class MovieCollection {
    private final List<Movie> movies = new ArrayList<>();

    public MovieCollection(){
        movies.add(new Movie("title1", 2015, 95));
        movies.add(new Movie("title2", 2018, 120));
        movies.add(new Movie("title3", 2000, 103));
        movies.add(new Movie("title4", 2011, 142);
        movies.add(new Movie("title5", 2001, 98));
    }

}
