package com.lambda;

// Lambda Expression with Single parameter
interface Function1 {
    void display(String name);
}
public class SingleParaExample {
    public static void main(String[] args) {
        String name = "ruturaj";

        Function1 f = (str) -> {
            System.out.println("Hello "+str);
        };

        f.display(name);
    }
}