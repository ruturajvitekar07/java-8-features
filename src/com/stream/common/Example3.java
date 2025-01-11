package com.stream.common;

import java.util.*;
import java.util.stream.Stream; 
  
public class Example3 {
  
    public static void main(String[] args) {
  
        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);
  
        System.out.println("The natural sorted stream according to provided Comparator is : ");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println();
        System.out.println("The reverse sorted stream according to provided Comparator is : ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();
        System.out.println("The default sorted stream according to provided Comparator is : ");
        list.stream().sorted().forEach(System.out::println);
    } 
} 