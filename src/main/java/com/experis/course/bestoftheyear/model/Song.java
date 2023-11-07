package com.experis.course.bestoftheyear.model;

public class Song {
    private String title;
    private String img;
    private String author;

    public Song(String title, String img, String author) throws IllegalArgumentException {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.title = title;
        this.img = img;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }


    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.title = title;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
