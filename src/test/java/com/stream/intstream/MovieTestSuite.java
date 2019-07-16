package com.stream.intstream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MovieTestSuite {
    @Test
    public void testGetListUsingFor() {
        // given
        MovieCollection movieCollection = new MovieCollection();

        // when
        List<Movie> movies = movieCollection.getMovies();

        // then
        int numberOfMoviesReleasedAfter2010 = 0;

        for(Movie movie: movies){
            if (movie.getYearORelease() > 2010) {
                numberOfMoviesReleasedAfter2010++;
            }
        }

        Assert.assertEquals(3, numberOfMoviesReleasedAfter2010);
    }

    @Test
    public void testGetListUsingIntstream(){
        // given
        MovieCollection movieCollection = new MovieCollection();

        // when
        List<Movie> movies = movieCollection.getMovies();

    }
}
