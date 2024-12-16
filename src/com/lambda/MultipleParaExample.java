package com.lambda;

// Lambda Expression with Multiple parameters
interface Function2 {
    int operation(int a, int b);
}
public class MultipleParaExample {
    public static void main(String[] args) {
        Function2 add = (a,b) -> a+b;
        Function2 multiplay = (a,b) -> a*b;
        Function2 substract = (a,b) -> a-b;
        Function2 divide = (a,b) -> a/b;

        System.out.println("Addition "+add.operation(5,2));
        System.out.println("Multiplication "+multiplay.operation(5,2));
        System.out.println("Subtraction "+substract.operation(5,2));
        System.out.println("Division "+divide.operation(5,2));

    }
}