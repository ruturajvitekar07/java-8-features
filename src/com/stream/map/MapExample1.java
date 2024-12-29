package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample1 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one","two","three","four");

        strings.stream().map(String::toUpperCase).forEach(System.out::println);

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);

        List<Integer> lengths = fruit.stream().map(String::length).toList();
        System.out.println("Lengths : "+lengths);
    }
}