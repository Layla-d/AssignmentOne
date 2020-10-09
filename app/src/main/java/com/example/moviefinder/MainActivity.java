package com.example.moviefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.moviefinder.model.IMovieData;
import com.example.moviefinder.model.Movie;
import com.example.moviefinder.model.MovieFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinnerFilter);
        editText = findViewById(R.id.txtSearch);

    }


    public void OnClickMovieSearch(View view) {
        String chosenOption = editText.getText().toString();
        String item = (String) spinner.getSelectedItem();
        String output = "";
        MovieFactory factory = new MovieFactory();
        IMovieData objMovie = factory.getModel();
        if (item.equals("Year")) {
            List<Movie> movies = objMovie.getMovieByYear(chosenOption);
            for (Movie movie : movies) {
                output += "▪️ " + movie.getTitle() + "\n";
            }

        } else if (item.equals("Any")) {
            List<Movie> movies = objMovie.getMovies(chosenOption, chosenOption, chosenOption);
            for (Movie movie : movies) {
                output += "▪️ " + movie.getTitle() + "\n";
            }
        } else if (item.equals("Title")) {
            List<Movie> movies = objMovie.getMovieByTitle(chosenOption);
            for (Movie movie : movies) {
                output += "▪ " + movie.getTitle() + "\n";
            }
        } else if (item.equals("Genre")) {
            List<Movie> movies = objMovie.getMovieByGenre(chosenOption);
            for (Movie movie : movies) {
                output += "▪ " + movie.getTitle() + "\n";
            }
        }

        EditText edtTxt = findViewById(R.id.txtSearchResult);
        edtTxt.setText(output);
    }
}