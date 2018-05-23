package com.madhusudhan.j8.functions.predicate;

import com.madhusudhan.j8.domain.Employee;

import java.util.function.Predicate;

public class PredicateFunction {

    Predicate<Employee> bonusLambda = (emp)-> emp.getRatings()>10?true:false;

    Predicate<String> emptyString = s -> s.isEmpty();

    public static void main(String[] args) {
    }
}
