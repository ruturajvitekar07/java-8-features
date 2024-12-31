package com.optional;

import java.util.Optional;

public class OptionalMethodsDemo {

    public static void main(String[] args) {

        String[] str = new String[5];
        str[2]= "This is optional class methods demo";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println("Empty : "+empty);

        // It returns a non-empty Optional instance
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

        // It returns value of an Optional.
        // If value is not present, it throws an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present otherwise false
        System.out.println(value.isPresent());

        Optional<Integer> op = Optional.empty();

        // orElse value
        System.out.println("Value by orElse method: "+ op.orElse(100));

        op.ifPresentOrElse(
                (value1)-> {
                    System.out.println("Value is : "+value1);
                },
                () -> {
                    System.out.println("Value is empty");
                }
        );

        System.out.println("Value by orElseGet (Supplier) method: "+
                op.orElseGet(
                    () -> (int)(Math.random() * 10)
                )
        );

        Optional<Integer> op1 = Optional.of(122);

        op1.ifPresentOrElse(
                (value1)-> {
                    System.out.println("Value is : "+value1);
                },
                () -> {
                    System.out.println("Value is empty");
                }
        );

        System.out.println("Value by orElseGet (Supplier) method: "+
                op1.orElseGet(
                        () -> (int)(Math.random() * 10)
                )
        );

    }
}
