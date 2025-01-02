package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LambdaCollectionExample {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(122);
        ints.add(23);
        ints.add(86);
        ints.add(99);
        ints.add(1);

//        returns negative value(-1), if and only if obj1 has to come before obj2.
//        returns positive value(+1), if and only if obj1 has to come after obj2.
//        returns zero(0), if and only if obj1 and obj2 are equal.

        // descending order
        Collections.sort(ints, (num1,num2) -> (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0);

        // ascending order
//        Collections.sort(ints, (num1,num2) -> (num1 > num2) ? 1 : (num1 < num2) ? -1 : 0);

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
