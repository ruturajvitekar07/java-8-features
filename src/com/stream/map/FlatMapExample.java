package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// map() function produces one output for one input value,
// whereas flatMap() function produces an arbitrary no of values as output (ie zero or more than zero) for each input value.

// flatMap() can be used where we have to flatten or transform out the string, as we cannot flatten our string using map().
// Example: Getting the 1st Character of all the String present in a
// List of Strings and returning the result in form of a stream.
public class FlatMapExample {

    public static void main(String[] args) {

        List<List<Integer>> number = new ArrayList<>();

        number.add(Arrays.asList(1, 2, 9));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6, 11, 10));
        number.add(Arrays.asList(7, 8, 17));

        System.out.println(number);
        System.out.println();
        List<Integer> integers = number.stream().flatMap(Collection::stream).toList();
        System.out.println(integers);
    }
}

// The flatMap() method in Java Streams is used when you need to transform each element of a stream into a stream
// of other elements (e.g., a list, array, or collection) and then flatten the result into a single stream.
// Essentially, it helps you avoid nested streams by "flattening" them into a single continuous stream.
// In streams or collections, flattening is about converting nested collections into a single, flat collection,
// allowing you to work with all the elements as if they were part of a single level.