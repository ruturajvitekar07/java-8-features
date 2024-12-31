package com.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Without Optional class
        // Exception in thread "main" java.lang.NullPointerException

        String[] words = new String[10];
//        String word = words[7].toLowerCase();
//        System.out.println(word);

        // With Optional class

        Optional<String> nullCheck = Optional.ofNullable(words[7]);

        if (nullCheck.isPresent()) {
            String word = words[7].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("Word is null");
        }

    }
}
