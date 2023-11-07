package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Movie;
import com.experis.course.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/home")
    public String home(Model model) {
        String name = "Matteo";
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> titles = getBestMovies();
        model.addAttribute("titles", titles);
        return "bestTitles";
    }


    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> titles = getBestSongs();
        model.addAttribute("titles", titles);
        return "bestTitles";
    }

    private static String getJoinedString(List<String> titles) {
        String titlesToString = String.join(", ", titles);
        return titlesToString;
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception",
                "https://c8.alamy.com/compit/2jh2pw0/poster-del-filmato-inizio-2010-2jh2pw0.jpg",
                4));
        movies.add(new Movie("Pulp Fiction",
                "https://static.posters.cz/image/750/poster/pulp-fiction-cover-i1288.jpg",
                5));
        movies.add(new Movie("La vita è bella",
                "https://m.media-amazon.com/images/S/pv-target-images/dce5e049d547bbb2479d75927921e225efed074f5f0c29f95363f8eaec2f0e2d.jpg",
                4));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("What's My Age Again",
                "https://i1.sndcdn.com/artworks-000428550354-xvjoim-t500x500.jpg",
                "Blink 182"));
        songs.add(new Song("Perth",
                "https://f4.bcbits.com/img/a1388691918_65",
                "Bon Iver"));
        songs.add(new Song("Sex Is On Fire",
                "https://m.media-amazon.com/images/I/71iT-e1vDOL._AC_UF1000,1000_QL80_.jpg",
                "Kings of Leon"));
        return songs;
    }
}
