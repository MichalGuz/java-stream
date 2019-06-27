package com.stream.lambda;

public class ExecutePrintSomething implements Executor {
    @Override
    public void process(){
        System.out.println("This is an example text.");
    }
}
