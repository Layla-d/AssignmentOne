package com.example.moviefinder.model;

import java.util.List;

public interface IMovieData {
    List<Movie> getMovies(String year, String title, String genre);
    List<Movie> getMovieByYear(String Year);
    List<Movie> getMovieByTitle(String title);
    List<Movie> getMovieByGenre(String genre);
}
