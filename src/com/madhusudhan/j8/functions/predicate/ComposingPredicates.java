package com.madhusudhan.j8.functions.predicate;

import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.function.Predicate;

public class ComposingPredicates {

    private void testPredicates(Trade trade){
        Predicate<Trade> bigTrade = t -> t.isBigTrade();
        Predicate<Trade> cancelledTrade = t -> t.isCancelledTrade();

        Predicate<Trade> bigAndCancelledTrade = t -> t.isBigTrade() && t.isCancelledTrade();

        /* AND */
        Predicate<Trade> bigandCancelledTrade2 = bigTrade.and(cancelledTrade);

        Predicate<Trade> newTrade = t -> t.getStatus().equals("NEW");
        Predicate<Trade> newOrBigTrade = newTrade.or(bigTrade);
    }

    public static void main(String[] args) {

    }
}
