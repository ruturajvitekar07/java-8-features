package com.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesWithCountString {

    public static Map<Character, Long> countCharacterOccurrences(String str){

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<Character, Long> countCharacterOccurrences1(String str){

        return str.chars()
                .filter(c -> c > 0) // Filter out invalid character codes
                .boxed() // Box the IntStream into a Stream<Integer> to allow further processing with streams.
                .collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting())); // Convert each integer back to a character for grouping.
    }

    public static void main(String[] args) {

        String input = "streamapiisawesome";

        Map<Character, Long> result = countCharacterOccurrences(input);
        Map<Character, Long> result1 = countCharacterOccurrences1(input);

        System.out.println(result);

        result1.forEach(((character, count) -> {
            System.out.println(character+" "+count);
        }));
    }
}
