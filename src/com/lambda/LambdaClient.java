package com.lambda;


// Lambda expressions in Java, introduced in Java SE 8, represent instances of functional interfaces
// (interfaces with a single abstract method). They provide a concise way to express instances of
// single-method interfaces using a block of code.

// Drawback - Java lambda functions can be only used with functional interfaces.
interface Sayable {
    String say();
}
public class LambdaClient {
    public static void main(String[] args) {
        String str = "ruturaj";

        // without lambda expression
        Sayable s1 = new Sayable() {
            @Override
            public String say() {
                return "Hello without lambda "+str;
            }
        };

        System.out.println(s1.say());

        // Lambda Expression with Zero parameter
        // using lambda expression
        Sayable s2 = () -> {
            return "Hello with lambda "+str;
        };

        System.out.println(s2.say());
    }
}