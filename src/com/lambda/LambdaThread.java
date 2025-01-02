package com.lambda;

public class LambdaThread {

    public static void main(String[] args) {

        Runnable myThread = () -> {
            Thread.currentThread().setName("RututajNewThread");
            System.out.println(Thread.currentThread().getName()+" is running");
        };

        Thread run = new Thread(myThread);
        run.start();
    }
}
