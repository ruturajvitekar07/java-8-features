package com.methodreference;

import java.util.*;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReference2 {
 
    public static void main(String[] args) {
        List<String> personList = new ArrayList<>();

        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");

        Collections.sort(personList, String::compareToIgnoreCase);
 
        personList.forEach(System.out::println);
    }
}