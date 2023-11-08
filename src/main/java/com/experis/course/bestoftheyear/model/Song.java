package com.experis.course.bestoftheyear.model;

public class Song {
    private String author;
    private String img;
    private String id;

    public Song(String id, String img, String author) throws IllegalArgumentException {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.id = id;
        this.img = img;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getImg() {
        return img;
    }


    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.id = id;
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
