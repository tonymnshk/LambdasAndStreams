package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Trade;
import com.madhusudhan.j8.util.TradeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalType {
    List<Trade> trades = TradeUtil.createTrades();

    private void attendeesOptional() {
        List<Integer> attendees = Arrays.asList(22, 34, 56, 19);
        //List<Integer> attendees = new ArrayList<>();
        Optional<Integer> attendeesOptional = attendees.stream().reduce(Integer::sum);

        attendeesOptional.ifPresent((i) -> System.out.println(i));
    }

    public static void main(String[] args) {
        new OptionalType().attendeesOptional();
    }
}
