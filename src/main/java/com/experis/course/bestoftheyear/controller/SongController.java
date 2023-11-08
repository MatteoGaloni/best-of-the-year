package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class SongController {
    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String songsDetail(@PathVariable("id") String id, Model model) {
        Song song = getSongById(id);
        model.addAttribute("selectedSong", song);
        return "song-detail";
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("1",
                "https://i1.sndcdn.com/artworks-000428550354-xvjoim-t500x500.jpg",
                "Blink 182"));
        songs.add(new Song("2",
                "https://f4.bcbits.com/img/a1388691918_65",
                "Bon Iver"));
        songs.add(new Song("3",
                "https://m.media-amazon.com/images/I/71iT-e1vDOL._AC_UF1000,1000_QL80_.jpg",
                "Kings of Leon"));
        return songs;
    }

    private Song getSongById(String code) {
        for (Song song : getBestSongs()) {
            if (song.getId().equals(code)) {
                return song;
            }
        }
        return null;
    }
}
