package com.madhusudhan.j8.basics.creatinglambdas;

public class CreatingAnonymouse {
    interface Greeting {
        String sayHello(String s);
    }

    private void testGreeting(String greeting) {
        String result;

        /*Greeting g = new Greeting() {
            public String sayHello(String s) {
               return  !s.isEmpty()? "Hello, " + s : "Did you forget anything";
            }
        };*/

        Greeting g = s -> !s.isEmpty()? "Hello, " + s : "Did you forget anything";

        result = g.sayHello(greeting);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        new CreatingAnonymouse().testGreeting("Tony");
    }


}
