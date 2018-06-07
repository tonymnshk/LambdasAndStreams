package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Employee;
import com.madhusudhan.j8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

public class DistinctLimitSkip {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testDistinct() {
        Stream<String> employeeNamesStream =
                employees
                .stream()
                .map(Employee::getName)
                .distinct();
        employeeNamesStream.forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        new DistinctLimitSkip().testDistinct();
    }
}
