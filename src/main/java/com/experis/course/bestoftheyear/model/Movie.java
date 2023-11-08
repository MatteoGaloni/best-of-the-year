package com.experis.course.bestoftheyear.model;

public class Movie {

    private String title;
    private String img;
    private String id;

    public Movie() {

    }

    public Movie(String title, String img, String id) throws IllegalArgumentException {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.title = title;
        this.img = img;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
    }
}
