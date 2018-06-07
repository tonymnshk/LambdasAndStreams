package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Employee;
import com.madhusudhan.j8.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

public class Filtering {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testFilering() {
        Stream<Employee> empStream = employees
                .stream()
                //.filter(Employee::isSenior)
                //.filter(e -> e.getDepartment().equals("Marketing"))
                .filter(e -> e.isExecutive());
        empStream.forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        new Filtering().testFilering();
    }
}
