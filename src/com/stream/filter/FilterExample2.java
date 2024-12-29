package com.stream.filter;

import java.util.ArrayList;

public class FilterExample2 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("shreyas");
        strings.add("abhijeet");
        strings.add("prasik");
        strings.add("nikhil");
        strings.add("vikas");

        strings.stream().filter(str -> str.endsWith("s")).forEach(System.out::println);
    }
}