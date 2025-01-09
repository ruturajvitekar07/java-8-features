package com.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3",
                "4", "5", "6", "7");

        list.stream()
                .flatMapToInt(integers -> IntStream.of(Integer.parseInt(integers)))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .flatMapToInt(str -> IntStream.of(str.length()))
                .forEach(System.out::println);
    }
}
