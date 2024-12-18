package com.stringjoiner;

import java.util.StringJoiner;

// It is used to construct a sequence of characters separated by a delimiter.
// Now, you can create string by passing delimiters like comma(,), hyphen(-) etc.
// You can also pass prefix and suffix to the char sequence.
public class StringJoinerExample {

    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter
          
        joinNames.add("Rahul");
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
    }  
}  