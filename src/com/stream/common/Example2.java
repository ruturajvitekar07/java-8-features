package com.stream.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Stream allMatch(Predicate predicate) returns whether all elements of this stream match the provided predicate.
// It may not evaluate the predicate on all elements if not necessary for determining the result.
// This is a short-circuiting terminal operation. A terminal operation is short-circuiting if,
// when presented with infinite input, it may terminate in finite time.

public class Example2 {
     
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        boolean answer = list.stream().allMatch(n-> n % 3 ==0);
        System.out.println(answer);

        Stream<String> stream = Stream.of("Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        boolean answer1 = stream.allMatch(str -> str.length() > 5);
        System.out.println(answer1);

        Stream<Integer> stream1 = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = stream1.takeWhile(number -> (number / 4 == 1)).collect(Collectors.toList());
        System.out.println(list1);
    }
}