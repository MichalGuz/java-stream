package com.stream.lambda;

public class PrintSomething implements LambdaExecutor{
    @Override
    public void execute(){
        System.out.println("Exercise #2 - using lambda instead of OOP");
    }
}
