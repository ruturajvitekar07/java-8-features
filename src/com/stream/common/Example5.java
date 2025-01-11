package com.stream.common;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Stream;

// noneMatch() of Stream class returns whether no elements of this stream match the provided predicate.
// It works. opposite to Stream anymatch() method.

// long count() returns the count of elements in the stream.
// This is a special case of a reduction (A reduction operation takes a sequence of input elements
// and combines them into a single summary result by repeated application of a combining operation).
// This is a terminal operation i.e, it may traverse the stream to produce a result or a side-effect.

// The close() method of PrintStream Class in Java is used to close the stream.
// Closing a stream deallocates any value in it or any resources associated with it.
// The PrintStream instance once closed won’t work.
// Also a PrintStream instance once closed cannot be closed again.

public class Example5 {
  
    public static void main(String[] args) {
  
        List<Integer> list = Arrays.asList(9, 18, 10, 25, 4, 3, 1, 705);
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println("Min : "+min);
        Integer max = list.stream().max(Integer::compare).get();
        System.out.println("Max : "+max);
        list.stream().peek(System.out::println).forEach(x -> {});
        System.out.println();
        Stream<String> stream = Stream.of("CSE", "C++", "Java", "DS");
        boolean answer = stream.noneMatch(str -> (str.length() == 5));
        System.out.println(answer);
        long count = list.stream().count();
        System.out.println(count);

        System.out.println("============");
        Stream<Integer> stream2 = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
        stream2.dropWhile(number -> (number / 4 == 1)).toList().forEach(System.out::println);
        System.out.println("============");

        try {
            PrintStream stream1 = new PrintStream(System.out);
            stream1.write(65);
            stream1.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            stream.close();
        }
    }
} 