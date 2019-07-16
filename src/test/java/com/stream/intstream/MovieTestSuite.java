package com.stream.intstream;

import org.junit.Test;

import java.util.List;

public class MovieTestSuite {
    @Test
    public void testGetListUsing() {
        // given
        MovieCollection movieCollection = new MovieCollection();

        // when
        List<Movie> movies = movieCollection.getMovies();

    }
}
