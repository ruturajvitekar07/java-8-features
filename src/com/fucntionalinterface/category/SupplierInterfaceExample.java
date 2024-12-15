package com.fucntionalinterface.category;

import java.util.function.Supplier;

// Supplier: Do not accept any arguments but return a value
// It acts as a factory or generator and returns a result when its method is called

// Common Use Cases:
// Lazy initialization: Create or load an object only when it is first accessed.
// Factories: Encapsulate object creation, often used with dependency injection frameworks.
// Default values: Provide fallback values or defaults when no value is available.
// Random value generation: Generate dynamic or random data.
// Memoization: Delay the execution of an expensive operation until it is required.
public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());
    }
}