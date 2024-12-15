package com.fucntionalinterface.category;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Consumer: Accept arguments but do not return any values
// It’s typically used for side effects such as modifying objects, printing, or logging

// Common Use Cases:
// Iterating over collections and performing an operation on each element.
// Logging actions or events.
// Modifying objects within a collection (e.g., adjusting values, changing states).
// Side-effect operations in stream processing (e.g., printing or accumulating results).
// Callbacks or event listeners where you want to pass a behavior for later execution.
public class ConsumerInterfaceExample {
    public static void main(String[] args) {

        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        modify.accept(list);
        System.out.println();
        dispList.accept(list);
    }
}