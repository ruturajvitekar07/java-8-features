package collections;

import java.util.concurrent.CopyOnWriteArrayList;

//Fail-Safe
//A Fail-Safe iterator doesn't throw ConcurrentModificationException
// if the collection is modified during iteration. Instead, it works on a clone (a copy) of the collection.

//Key Points
//Fail-Safe iterators operate on a separate copy of the collection.
//They are usually implemented in concurrent collections like CopyOnWriteArrayList, ConcurrentHashMap, etc.
//Changes made to the original collection are not reflected in the iteration.

//Fail-Safe: Ideal for concurrent or multi-threaded environments to avoid exceptions during modification.
public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            System.out.println(item);
            // Modifying the collection during iteration
            list.add("D"); // No exception will be thrown
        }

        System.out.println("Final List: " + list);
    }
}
