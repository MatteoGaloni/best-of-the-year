package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MovieController {
    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }


    @GetMapping("/movies/{id}")
    public String moviesDetail(@PathVariable("id") String id, Model model) {
        Movie movie = getMovieById(id);
        model.addAttribute("selectedMovie", movie);
        return "movie-detail";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception",
                "https://c8.alamy.com/compit/2jh2pw0/poster-del-filmato-inizio-2010-2jh2pw0.jpg",
                "1"));
        movies.add(new Movie("Pulp Fiction",
                "https://static.posters.cz/image/750/poster/pulp-fiction-cover-i1288.jpg",
                "2"));
        movies.add(new Movie("La vita è bella",
                "https://m.media-amazon.com/images/S/pv-target-images/dce5e049d547bbb2479d75927921e225efed074f5f0c29f95363f8eaec2f0e2d.jpg",
                "3"));
        return movies;
    }

    private Movie getMovieById(String code) {
        for (Movie movie : getBestMovies()) {
            if (movie.getId().equals(code)) {
                return movie;
            }
        }
        return null;
    }

}