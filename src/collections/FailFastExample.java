package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Fail-Fast
//A Fail-Fast iterator immediately throws a ConcurrentModificationException
// if the collection is structurally modified after the iterator is created,
// except through the iterator's own remove() method.

//Fail-Fast iterators operate directly on the collection.
//They fail as soon as they detect a modification during iteration.
//Fail-Fast iterators use a modCount variable to keep track of structural modifications.

//What is modCount in Java?
//modCount is a protected integer field in many Java collections (like ArrayList, HashMap, etc.)
// that tracks the number of structural modifications made to the collection.
// A structural modification refers to any operation that changes the size of the collection,
// such as adding, removing, or clearing elements.

//How modCount Works ?
//Each time the collection is structurally modified, the modCount value is incremented.
//When an iterator is created, it stores the current modCount value in its internal state
//(usually in a field called expectedModCount).
//During iteration, the iterator checks if the modCount of the collection matches its expectedModCount.
//If there's a mismatch, it means the collection was modified outside the iterator,
// and a ConcurrentModificationException is thrown.

//Fail-Fast: Suitable for single-threaded environments where immediate failure upon modification is needed.
public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Modifying the collection during iteration
            list.add("D"); // This will throw ConcurrentModificationException
        }
    }
}
