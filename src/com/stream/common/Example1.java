package com.stream.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream anyMatch(Predicate predicate) returns whether any elements of this stream match the provided predicate.
// It may not evaluate the predicate on all elements if not necessary for determining the result.
// This is a short-circuiting terminal operation. A terminal operation is short-circuiting if,
// when presented with infinite input, it may terminate in finite time.

// SYNTAX -
// boolean anyMatch(Predicate<? super T> predicate)
//
// Where, T is the type of the input to the predicate
// and the function returns true if any elements of
// the stream match the provided predicate, otherwise false.
public class Example1 {
  
    public static void main(String[] args) {
  
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e", "f", "g", "h");

        boolean answer = stream.anyMatch(str -> str.contains("c"));
        System.out.println(answer);

        System.out.println("===============");

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        boolean answer1 = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);

        System.out.println(answer1);
    } 
} 