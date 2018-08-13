package com.madhusudhan.j8.functions.biconsumer;

import com.madhusudhan.j8.domain.Employee;
import com.madhusudhan.j8.functions.bipredicate.BiPredicateFunction;

import java.util.function.BiConsumer;

public class BiConsumerFunction {
    BiConsumer<Employee, Integer> empBonusConsumer =
            (emp, bonus) -> System.out.printf("Emploee %s is set of %d pct of bonus:",
                    emp, bonus);

    BiConsumer<Employee, Integer> empSalaryHikeConsumer =
            (emp, bonus) -> System.out.printf("Emploee %s is receiving %d hike in salary :",
                    emp, bonus);

    BiConsumer<Employee, Integer> empBonusAndSalaryHikeConsumer = empBonusConsumer.andThen(empSalaryHikeConsumer);



    private void testBiConsumer(Employee emp, Integer bonus, Integer salaryHike) {
        //empBonusConsumer.accept(emp, bonus);
        //empSalaryHikeConsumer.accept(emp, salaryHike);
        empBonusAndSalaryHikeConsumer.accept(emp, bonus);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(10);
        int bonus = 5;
        int salaryHike = 15;
        new BiConsumerFunction().testBiConsumer(emp, bonus, salaryHike);
    }
}
