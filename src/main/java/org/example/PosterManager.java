package org.example;

import java.util.Arrays;

public class PosterManager {
    private Poster[] poster = new Poster[0];
    private int limitPoosters = 5;
//    private Poster[] arr;

    public PosterManager() {
        this.limitPoosters = 5;
    }

    public PosterManager(int limitPoosters) {
        this.limitPoosters = limitPoosters;

    }

    // 1. *******// Добавление нового фильма

    public void save(Poster itemFilm) {
        Poster[] tmp = new Poster[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = itemFilm;
        poster = tmp;
    }


    public Poster[] findAll() {
        return poster;

    }

    // *******************************  // вывод фильмов в обратном порядке
    public Poster[] findLast() {
        int resultLenght;
        if (limitPoosters > poster.length) {
            resultLenght = poster.length;
        } else {
            resultLenght = limitPoosters;
        }
        Poster[] all = getPoster();
        Poster[] result = new Poster[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];

        }
        return result;
    }

    public Poster[] getPoster() {
        return poster;
    }


}
