package com.fucntionalinterface;


// The methods inherited from the Object class are considered special bcoz they are not treated as
// abstract methods in th context of functional interface.
// Even if an interface redeclare a method from the Object class, it does not count towards the one abstract method
// limit required for it to be a functional interface.
// The methods of the Object class do not contribute to this count bcoz they are inherited, not declared abstract ny the interface.
// Interface in java do not extend Object class directly. All the interfaces implicitly have access to the
// methods of the object class bcoz it is root class of the all classes.
// Every interface implicitly inherits the methods from the Object class.

@FunctionalInterface
interface sayable {
    void say(String msg);

    // It can contain any number of Object class methods.
    @Override
    int hashCode();
    String toString();  
    boolean equals(Object obj);  
}

public class FunctionalInterfaceExample2 implements sayable {
    public void say(String msg) {
        System.out.println(msg);  
    }

    public static void main(String[] args) {  
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();  
        fie.say("Hello there");  
    }  
}  