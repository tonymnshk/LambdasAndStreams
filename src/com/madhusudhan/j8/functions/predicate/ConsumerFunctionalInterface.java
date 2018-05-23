package com.madhusudhan.j8.functions.predicate;

import com.madhusudhan.j8.domain.Movie;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m -> System.out.println("Printing out movie info" + m);

    Consumer<Movie> persistMovie = m -> persist(m);

    Consumer<Movie> notifyMovie = m -> notify(m);

    private void notify(Movie m) {
        System.out.println("Notifying about movie" + m);
    }

    private void persist(Movie m) {
        System.out.println("Persisting movie " + m);
    }

    private void testConsumer(Movie movie) {
        printInfo.accept(movie);
        persistMovie.accept(movie);
    }

    private void testAndThen(Movie m) {
        Consumer<Movie> printAndPersistMovie = persistMovie.andThen(printInfo);
        printAndPersistMovie.accept(m);

        Consumer<Movie> chainedConsumer = notifyMovie.andThen(persistMovie).andThen(printInfo);
        chainedConsumer.accept(m);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Gods Must Be Crazy");
        new ConsumerFunctionalInterface().testConsumer(movie);
        new ConsumerFunctionalInterface().testAndThen(movie);

    }
}
