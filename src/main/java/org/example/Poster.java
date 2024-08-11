package org.example;

public class Poster {

    private int id;  // ид фильма
    private String imgUrl;
    private String filmName; // название
    private String genre; //жанр.


    public Poster(int id, String imgUrl, String filmName, String genre) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.filmName = filmName;
        this.genre = genre;
    }

    public Poster() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}