package com.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapToDoubleExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1.5", "2.7", "3", "4", "5.6");

        list.stream()
                .flatMapToDouble(num -> DoubleStream.of(Double.parseDouble(num)))
                .forEach(System.out::println);

        List<String> strs = Arrays.asList("pune", "kolhapur", "mumbai", "satara");

        strs.stream().flatMapToDouble(str
                        -> DoubleStream.of(str.length()))
                .forEach(System.out::println);
    }
}
