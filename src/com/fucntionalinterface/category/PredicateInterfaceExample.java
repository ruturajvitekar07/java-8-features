package com.fucntionalinterface.category;

import java.util.function.Predicate;

// Predicate: To perform a test and return a Boolean value
// It is used to evaluate an input and returns a boolean result (true or false)
// This makes it ideal for situations where you need to filter, match, or perform logical tests on data

// Common Use Cases:
// Filtering elements in collections or streams.
// Validating input or checking conditions (e.g., validating user input in forms).
// Combining multiple conditions using logical operators (and, or, negate).
// Conditional event handling where certain actions should only be performed if a condition holds true.
public class PredicateInterfaceExample {
    public static void predict(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        predict(10, (i) -> i > 7);

    }
}