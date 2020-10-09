package com.example.moviefinder.model;

public class Movie {
    private String year;
    private String title;
    private String genre;

    public Movie(String year, String title, String genre) {
        this.year = year;
        this.title = title;
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
