package com.methodreference;

// Method reference is used to refer method of functional interface.
// It is compact and easy form of lambda expression.
// Each time when you are using lambda expression to just referring a method,
// you can replace your lambda expression with method reference

interface Sayable{
    void say();
}
public class MethodReferenceExample {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReferenceExample::saySomething;
        sayable.say();
    }
}