package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// The map() method in Java Streams is used to transform the elements of a stream.
public class MapExample {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        nums.stream().map(num -> num * 2).toList().forEach(System.out::println);
        System.out.println();
        List<String> list = Arrays.asList("c", "d",
                "b", "a","k");
        list.parallelStream().forEach(System.out::println);
        System.out.println();
        list.parallelStream().forEachOrdered(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        System.out.println("Using forEach with Parallel Stream:");
//        numbers.parallelStream().forEach(System.out::println);
//
//        System.out.println("\n\nUsing forEachOrdered with Parallel Stream:");
//        numbers.parallelStream().forEachOrdered(System.out::println);
    }
}