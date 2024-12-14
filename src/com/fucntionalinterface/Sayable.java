package com.fucntionalinterface;

// An interface that contains exactly one abstract method is known as functional interface.
@FunctionalInterface
public interface Sayable {
    void say();
}


// It can have any number of static. default methods but can contain only one abstract method.
@FunctionalInterface
interface Walkable {
    void walk();

    static void run(){
        System.out.println("Start running");
    }

    default int walkingSpeed(){
        return 50;
    }
}