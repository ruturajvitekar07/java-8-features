package com.stream.filter;

import java.util.ArrayList;
import java.util.List;

// To filter out from the objects we do have a function named filter()
public class FilterExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(7);

        List<Integer> even = list.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> odd = list.stream().filter(num -> num % 2 != 0).toList();

        System.out.println("Even : "+even);
        System.out.println("Odd : "+odd);

    }
}