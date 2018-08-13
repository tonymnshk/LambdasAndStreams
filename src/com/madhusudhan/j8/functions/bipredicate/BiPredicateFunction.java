package com.madhusudhan.j8.functions.bipredicate;

import com.madhusudhan.j8.domain.Employee;
import com.madhusudhan.j8.domain.Manager;

import java.util.function.BiPredicate;

public class BiPredicateFunction {
    BiPredicate<Employee, Manager> empManagerBiPredicate = (emp, manager) ->
            emp.getManager().equals(manager) ? true : false;

    private void testBiPredicate(Employee emp, Manager manager) {
        boolean isManager = empManagerBiPredicate.test(emp, manager);
        System.out.println("Is manager? " + isManager);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(99);
        Manager manager = new Manager();
        emp.setManager(manager);
        new BiPredicateFunction().testBiPredicate(emp, manager);
    }
}
