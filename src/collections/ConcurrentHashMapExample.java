package collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));

            // Concurrent modification: Add a new key-value pair during iteration
            map.put(4, "Four"); // No ConcurrentModificationException
        }

        System.out.println("Final Map: " + map);
    }
}
