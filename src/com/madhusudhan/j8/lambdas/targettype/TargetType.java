package com.madhusudhan.j8.lambdas.targettype;

public class TargetType {
    public interface Email {
        String constructEmail(String name);
    }

    Email email = (name) -> name + "@google.com";

    public String getEmail(String name, Email email){
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("tony", name -> name + "@google.com");

    }
}
