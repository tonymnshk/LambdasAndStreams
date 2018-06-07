package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Movie;
import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.MovieUtil;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Collecting {
    List<Trade> trades = TradeUtil.createTrades();

    private void collectIntoAList() {

        /*System.out.println(trades);
        System.out.println("===================");*/

        List<Trade> tradeCollection =
                trades.stream()
                        .collect(toList());
        System.out.println(tradeCollection);
    }

    private void collectIntoASet() {
        Set<Trade> tradeSet = trades
                .stream().collect(Collectors.toSet());
        System.out.println(tradeSet);
    }

    private void collectIntoAMap() {
        List<Movie> movies = MovieUtil.createMovies();
        Map<String, Movie> movieMap =
                movies
                        .stream()
                        .collect(Collectors.toMap(Movie::getName, m -> m));
        System.out.println(movieMap);

    }

    public static void main(String[] args) {
        new Collecting().collectIntoAList();
        new Collecting().collectIntoASet();
        new Collecting().collectIntoAMap();
    }
}
