package com.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduce = numbers.stream().reduce(7, (a, b) -> {
            System.out.println("a : "+a);
            System.out.println("b : "+b);
            int c = a + b;
            System.out.println("c : "+c);
            return c;
        });

        System.out.println("Result : "+reduce);

        List<String> words = Arrays.asList("Hello", "World", "from", "Java");

        String result = words.stream().reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenated String: " + result.trim());
    }
}