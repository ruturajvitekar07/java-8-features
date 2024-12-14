package com.fucntionalinterface;

// A Marker Interface is an interface in Java that does not contain any methods or fields.
// Its purpose is to "mark" or signal to the JVM or a framework that
// the class implementing it has a specific property or should be treated in a certain way.

interface Interface1 {
}


// A functional interface can extends another interface only it does not have any abstract method.
// i.e A functional interface can extends marker interface and still remains a functional interface.
// examples -  Serializable, Clonable etc.

@FunctionalInterface
public interface MyInterface extends Interface1 {
    void show();
}