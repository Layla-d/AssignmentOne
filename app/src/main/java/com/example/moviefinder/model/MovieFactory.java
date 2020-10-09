package com.example.moviefinder.model;

public class MovieFactory {
    public IMovieData getModel(){
        return new MovieData();
    }
}
