package com.madhusudhan.j8.basics.creatinglambdas;

public class CreatingLambdas {
    interface Greeting {
        String sayHello(String g);
    }

    /*private void testGreeting(String greeting) {
        String result;
        Greeting g = s -> !(s.isEmpty())? "Hello, " + s: "Did you forget something?";
        result = g.sayHello(greeting);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().testGreeting("Tony");
    }*/

    private void testGreeting(String s, Greeting g) {
        String result = g.sayHello(s);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().testGreeting("", s -> !(s.isEmpty())? "Hello, " + s: "Did you forget something?");
    }

}
