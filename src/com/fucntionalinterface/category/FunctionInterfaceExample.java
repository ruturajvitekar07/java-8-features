package com.fucntionalinterface.category;

import java.util.function.Function;

// Function: To transform arguments in returnable value
// It is commonly used in situations where you need to apply a transformation or mapping from one type to another

// Common Use Cases:
// Stream API for mapping and transforming data.
// Optional API (e.g., map method).
// Writing reusable and composable utility methods that accept functional transformations as arguments.
public class FunctionInterfaceExample {
    public static void main(String[] args) {

        Function<Integer, Double> half = a -> a / 2.0;
        half = half.andThen(a -> 3 * a);

        System.out.println(half.apply(10));

        Function<Integer, Integer> i = Function.identity();

        System.out.println(i.apply(10));
    }
}