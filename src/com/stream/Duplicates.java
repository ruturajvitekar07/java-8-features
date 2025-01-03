package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {


    private static <T> Set<T> findDuplicateInStreamUsingFrequency(List<T> integers) {

        return integers.stream()
                .filter(i -> Collections.frequency(integers,i) > 1) // count the frequency of each element and filter elements with frequency > 1
                .collect(Collectors.toSet());
    }

    private static <T> Set<T> findDuplicateInStreamUsingGroupingBy(List<T> integers) {

        return integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // group the elements along with their count into map
                .entrySet().stream() // convert it to map
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    private static <T> Set<T> findDuplicateInStreamUsingSet(List<T> integers) {

        Set<T> items = new HashSet<>();
        return integers.stream()
                .filter(n -> !items.add(n)) // Set.add() return false if number is already present
                .collect(Collectors.toSet());
    }


    public static void main(String[] args) {

        List<Integer> integers = List.of(1,55,23,109,67,19,22,55,1,2,55,77,23,109);

        System.out.println(findDuplicateInStreamUsingFrequency(integers));
        System.out.println(findDuplicateInStreamUsingGroupingBy(integers));
        System.out.println(findDuplicateInStreamUsingSet(integers));
    }


}
