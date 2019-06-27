package com.stream;

import com.stream.lambda.PrintSomething;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Exercises with functional programming - Java, interface Stream.");

        PrintSomething printSomething = new PrintSomething();
        printSomething.printSomething();
    }
}
