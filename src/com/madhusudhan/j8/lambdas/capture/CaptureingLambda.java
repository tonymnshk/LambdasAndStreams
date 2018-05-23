package com.madhusudhan.j8.lambdas.capture;

import com.madhusudhan.j8.domain.Trade;

public class CaptureingLambda {
    Trade trade = new Trade("IBM", 20000, "OPEN");

    public interface ITrade {
        boolean check(Trade t);
    }

    public boolean isOpenTrade() {
        ITrade simpleLambda = t -> t.isOpen() ? true : false;
        return simpleLambda.check(trade);
    }

    public boolean checkStatus(String status) {
        ITrade statusLambda = t -> t.getStatus().equals(status) ? true : false;
        return statusLambda.check(trade);
    }


    public static void main(String[] args) {
        CaptureingLambda cl = new CaptureingLambda();
        System.out.println("is Open Trade using non-capturing lambda: " + cl.isOpenTrade());
    }
}
