package com.stream.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        LambdaProcessor lambdaProcessor = new LambdaProcessor();
        lambdaProcessor.lambdaProcess(() -> System.out.println("Exercise #2 - using lambda instead of OOP"));
    }
}
