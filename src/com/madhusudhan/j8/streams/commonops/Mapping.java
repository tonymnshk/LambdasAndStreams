package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Employee;
import com.madhusudhan.j8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testMapping() {
        Stream<String> empStream = employees
                .stream()
                .map(Employee::getName)
                .map(String::toUpperCase);

        empStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Mapping().testMapping();
    }
}
