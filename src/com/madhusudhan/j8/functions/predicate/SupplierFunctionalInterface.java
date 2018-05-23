package com.madhusudhan.j8.functions.predicate;

import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<String[]> fruitSupplier = () -> new String[]{"Apple", "Orange"};

    Supplier<List<Trade>> tradeSupplier = () -> TradeUtil.createTrades();

    private void testSupplier() {
        String[] fruits = fruitSupplier.get();
        Arrays.stream(fruits).forEach(s -> System.out.println("Fruit is: " + s));

        List<Trade> trades = tradeSupplier.get();
        trades.stream().forEach(t -> System.out.println("Trade is: " + t));
    }

    public static void main(String[] args) {
        new SupplierFunctionalInterface().testSupplier();
    }
}
