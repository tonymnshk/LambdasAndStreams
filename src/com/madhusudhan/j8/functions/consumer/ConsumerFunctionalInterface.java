package com.madhusudhan.j8.functions.consumer;

import com.madhusudhan.j8.domain.Movie;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m -> System.out.println("Printing out movie info: " + m);

    Consumer<Movie> persistMovie = m -> persist(m);

    Consumer<Movie> notifyMovie = m -> notifyMovie(m);

    private void testConsumer(Movie movie) {
        printInfo.accept(movie);
        persistMovie.accept(movie);

    }

    private void testAndThen(Movie movie) {
        Consumer<Movie> printAndPersistMovie = printInfo.andThen(persistMovie);
        printAndPersistMovie.accept(movie);

        System.out.println("------------------");
        Consumer<Movie> chainedConsumer = notifyMovie.andThen(persistMovie).andThen(printInfo);
        chainedConsumer.accept(movie);
    }

    private void notifyMovie(Movie movie) {
        System.out.println("Notifying about movie" + movie);
    }

    private void persist(Movie m) {
        System.out.println("Persisting movie" + m);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Gods Must Be Crazy");
        new ConsumerFunctionalInterface().testConsumer(movie);
        System.out.println("---------------");
        new ConsumerFunctionalInterface().testAndThen(movie);
    }
}
