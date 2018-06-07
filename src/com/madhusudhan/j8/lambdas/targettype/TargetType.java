package com.madhusudhan.j8.lambdas.targettype;

public class TargetType {
    public interface Email {
        String constructEmail(String name);
    }

    public static void main(String[] args) {
        //useAnonymouse();
        //useLambda();
        userLambda2();

    }

    static void useAnonymouse() {
        Email email = new Email() {
            @Override
            public String constructEmail(String name) {
                return name + "@google.com";
            }
        };
        System.out.println(email.constructEmail("tony"));
    }

    static void useLambda() {
        Email email = name -> name + "@apple.com";
        System.out.println(email.constructEmail("tony"));
    }

    static void printEmail(String name, Email email) {
        System.out.println(email.constructEmail(name));
    }

    static void userLambda2() {
        printEmail("Tony", name -> name + "@seagate.com");
    }
}
