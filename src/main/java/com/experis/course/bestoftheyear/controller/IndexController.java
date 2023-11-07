package com.experis.course.bestoftheyear.controller;

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
        List<String> titles = getBestMovies();
        String titlesToString = getJoinedString(titles);
        model.addAttribute("titles", titlesToString);
        return "bestTitles";
    }


    @GetMapping("/songs")
    public String songs(Model model) {
        List<String> titles = getBestSongs();
        String titlesToString = getJoinedString(titles);
        model.addAttribute("titles", titlesToString);
        return "bestTitles";
    }

    private static String getJoinedString(List<String> titles) {
        String titlesToString = String.join(", ", titles);
        return titlesToString;
    }

    private List<String> getBestMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("Pulp Fiction");
        movies.add("The Aviator");
        return movies;
    }

    private List<String> getBestSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("What's My Age Again");
        songs.add("Perth");
        songs.add("Sex Is On Fire");
        return songs;
    }
}
