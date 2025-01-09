package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        boolean result = list.stream().allMatch(num -> num > 2);
        System.out.println(result);

        boolean result1 = list.stream().allMatch(num -> num % 3 == 0);
        System.out.println(result1);

        Stream<String> stream = Stream.of("Ruturaj", "Ganesh", "shreyas", "ishan");

        boolean result2 = stream.allMatch(str -> str.length() > 4);
        System.out.println(result2);

        Stream<String> stream1 = Stream.of("Ruturaj", "Ganesh", "shreyas", "ishan");

        boolean result3 = stream1.allMatch(str -> Character.isUpperCase(str.charAt(1)));
        System.out.println(result3);

        List<String> strs = Arrays.asList("pune", "kolhapur", "mumbai", "satara");

        strs.stream().forEachOrdered(System.out::println);

        Optional<Integer> ans = list.stream().findAny();
        if (ans.isPresent()){
            System.out.println("Answer : "+ans.get());
        } else {
            System.out.println("null");
        }

    }
}
