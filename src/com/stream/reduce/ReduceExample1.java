package com.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceExample1 {

    public static void main(String[] args) {

        int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-999);
        System.out.println("The product is : " + product);

        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("The sum of all elements is : " + sum);
    }
}