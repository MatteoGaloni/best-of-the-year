package com.experis.course.bestoftheyear.model;

public class Movie {
    private String title;
    private String img;
    private int rating;

    public Movie() {

    }

    public Movie(String title, String img, int rating) throws IllegalArgumentException {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title can't be empty");
        }
        this.title = title;
        this.img = img;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public int getRating() {
        return rating;
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

    public void setRating(int rating) {
        this.rating = rating;
    }
}
