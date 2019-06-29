package com.stream.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        LambdaProcessor lambdaProcessor = new LambdaProcessor();

        //you may use lambda expression when interface has only the one method
        lambdaProcessor.lambdaProcess(() -> System.out.println("Exercise #2 - using lambda instead of OOP"));
    }
}
