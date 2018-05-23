package com.madhusudhan.j8.basics.examplelambdas;

import com.madhusudhan.j8.domain.Trade;
import jdk.management.resource.ResourceId;

import java.util.concurrent.Callable;

public class Runnables {
    public void methodAcceptingRunnable(Runnable r) {
        r.run();
    }

    public void methodAcceptingCallable(Callable c) throws Exception {
        System.out.println(c.call());

    }

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> System.out.println("Hello, Lambda");

        new Runnables().methodAcceptingRunnable(runnable);

        Callable callable = () -> "Hello, Callable";
        new Runnables().methodAcceptingCallable(callable);

        new Runnables().methodAcceptingCallable(() -> {
            return "Hello";
        });

    }

    private static void email() {
    }

    private static void persist() {
    }

    interface Tradable<Trade> {
        boolean check(Trade t);
    }

    Tradable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();

    Tradable<Trade> ibmTradeLambd = (t) -> t.getInstrument().equals("IBM");
}
