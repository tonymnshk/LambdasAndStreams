package com.madhusudhan.j8.functions.fuction;

import com.madhusudhan.j8.domain.Movie;
import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionFunctionalInterface {
    Supplier<List<Trade>> tradesSupplier = () -> TradeUtil.createTrades();

    Function<String, Movie> createMovieFuction = s -> new Movie(s);

    Function<Integer, Trade> tradeFinder = id -> {
        List<Trade> trades = tradesSupplier.get();
        return trades.stream().filter(t -> t.getId() == id).findFirst().get();
    };

    private void testFunction(String movieName) {
        Movie m = createMovieFuction.apply(movieName);
        System.out.println("Movie is: " + m);

        Trade t = tradeFinder.apply(2);
        System.out.println("Trade is: " + t);

    }

    public static void main(String[] args) {

        new FunctionFunctionalInterface().testFunction("Gods Must Be Crazy");
    }
}
