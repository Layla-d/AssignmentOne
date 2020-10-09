package com.example.moviefinder.model;

import java.util.ArrayList;
import java.util.List;

public class MovieData implements IMovieData {
    private ArrayList<Movie> movie = new ArrayList<>();
    public MovieData(){
        movie.add(new Movie("2020", "Tenet", "Action"));
        movie.add(new Movie("2019", "Avengers: Endgame", "Action"));
        movie.add(new Movie("2018", "Mission Impossible", "Action"));
        movie.add(new Movie("2016", "Dead Pool", "Action"));
        movie.add(new Movie("2016", "Doctor Strange", "Action"));
        movie.add(new Movie("2020", "Mulan", "Action"));
        movie.add(new Movie("2018", "Incredibles 2", "Animation"));
        movie.add(new Movie("2016", "Moana", "Animation"));
        movie.add(new Movie("2014", "The Lego Movie", "Animation"));
        movie.add(new Movie("2018", "The Grinch", "Animation"));
        movie.add(new Movie("2018", "Sherlock Gnomes", "Animation"));
        movie.add(new Movie("2018", "Charming", "Animation"));
        movie.add(new Movie("1939", "Gone with the Wind", "Drama"));
        movie.add(new Movie("2016", "Arrival", "Drama"));
        movie.add(new Movie("2017", "Good Time", "Drama"));
        movie.add(new Movie("2004", "The Notebook", "Drama"));
        movie.add(new Movie("1999", "The Fight Club", "Drama"));
        movie.add(new Movie("1997", "Titanic", "Drama"));
        movie.add(new Movie("2010", "The Social Network", "Drama"));
        movie.add(new Movie("1994", "Hoop Dreams", "Documentary"));
        movie.add(new Movie("1988", "The Thin Blue Line", "Documentary"));
        movie.add(new Movie("2018", "Game Night", "Comedy"));
        movie.add(new Movie("2011", "Bridesmaids", "Comedy"));
        movie.add(new Movie("2016", "Zootropolis", "Comedy"));
        movie.add(new Movie("2017", "Lady Bird", "Comedy"));
        movie.add(new Movie("2017", "Logan Lucky", "Comedy"));
        movie.add(new Movie("2017", "Coco", "Family"));
        movie.add(new Movie("2017", "Paddington", "Family"));
        movie.add(new Movie("2017", "Wonder", "Family"));
        movie.add(new Movie("2017", "Paddington 2", "Family"));
        movie.add(new Movie("1995", "Toy Story", "Family"));
        movie.add(new Movie("2003", "Finding Nemo", "Family"));
        movie.add(new Movie("2018", "Halloween", "Horror"));
        movie.add(new Movie("2018", "The Nun", "Horror"));
        movie.add(new Movie("2016", "Hush", "Horror"));
        movie.add(new Movie("2016", "Raw", "Horror"));
        movie.add(new Movie("2016", "The Void", "Horror"));

    }

    public List<Movie> getMovies(String year, String title, String genre){
        ArrayList<Movie> data = new ArrayList<>();
        for(Movie mov : movie){
            if(mov.getYear().equals(year)) {
                data.add(mov);
            }
              else if(mov.getTitle().endsWith(title) || mov.getTitle().contains(title)){
                data.add(mov);
                }

              else if(mov.getGenre().endsWith(genre)){
                  data.add(mov);
            }
        }
        return data;
    }

    public List<Movie> getMovieByYear(String year){

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie mov : movie){
            if(mov.getYear().equals(year)){
                data.add(mov);
            }
        }
        return data;
    }

    public List<Movie> getMovieByTitle(String title){

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie mov : movie){
            if(mov.getTitle().equals(title) || mov.getTitle().contains(title)){
                data.add(mov);
            }
        }
        return data;
    }

    public List<Movie> getMovieByGenre(String genre){

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie mov : movie){
            if(mov.getGenre().equals(genre)){
                data.add(mov);
            }
        }
        return data;
    }

}
