package com.madhusudhan.j8.streams.commonops;

import com.madhusudhan.j8.domain.Student;

import java.util.Optional;

public class OptionalType {
    private void creatingOptions() {
        Student student = null;
        Optional<Student> studentOptional2 = Optional.ofNullable(student);
        System.out.println("Student can't be null:" + studentOptional2);
    }

    public static void main(String[] args) {
        new OptionalType().creatingOptions();
    }
}
