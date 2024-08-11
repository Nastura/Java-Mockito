import org.example.Poster;
import org.example.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PosterManagerTest {

    Poster film1 = new Poster(1, "???", "Бладшот", "боевик");
    Poster film2 = new Poster(2, "???", "Вперёд", "мультфильм");
    Poster film3 = new Poster(3, "???", "Отель <Белград>", "комедия");
    Poster film4 = new Poster(4, "???", "Джентельмены", "боевик");
    Poster film5 = new Poster(5, "???", "Человек-невидимка", "ужасы");
    Poster film6 = new Poster(6, "???", "Тролли.Мировой тур", "мультфильм");
    Poster film7 = new Poster(7, "???", "Номер один", "комедия");


    @Test  // пустой репозиторий

    public void emptyRepository() {
        PosterManager repo = new PosterManager();
        Poster[] expected = {};
        Poster[] actual = repo.getPoster();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test  // Добавление нового фильма
    public void saveFilm() {

        PosterManager repo = new PosterManager();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        Poster[] expected = {film1, film2, film3, film4, film5};
        Poster[] actual = repo.getPoster();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test   // Вывод всех фильмов в порядке добавления
    public void emptyRy() {
        PosterManager repo = new PosterManager();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        repo.findAll();

        Poster[] expected = {film1, film2, film3, film4, film5};
        Poster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void minLimitFilm() {   // Вывод максимально лимит* штук последних добавленных фильмов // по умолчанию 5
        PosterManager repo = new PosterManager();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);

        Poster[] expected = {film7, film6, film5, film4, film3};
        Poster[] actual = repo.findLast();
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void oneFilm() {   // Вывод максимально лимит* штук последних добавленных фильмов // по умолчанию 5
        PosterManager repo = new PosterManager(1);

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);

        Poster[] expected = {film7};
        Poster[] actual = repo.findLast();
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);

    }


}