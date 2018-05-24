package com.madhusudhan.j8.functions.supplier;

import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<String[]> fruitSupplier = () -> new String[]{"Apple", "Orange"};

    Supplier<List<Trade>> tradeSupplier = () -> TradeUtil.createTrades();

    private void testSupplier() {
        String[] fruits = fruitSupplier.get();
        for (String f : fruits) {
            System.out.println("Fruit is: " + f);
        }

        tradeSupplier.get().stream().forEach(t -> System.out.println("Trade is: " + t));
    }

    public static void main(String[] args) {
        new SupplierFunctionalInterface().testSupplier();
    }
}
