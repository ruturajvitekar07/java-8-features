package com.stream.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(24);
        list.add(2);
        list.add(17);
        list.add(4);
        list.add(16);

        list.stream().filter(num -> num % 2 == 0)
                .filter(num -> num > 10).toList().forEach(System.out::println);
    }
}