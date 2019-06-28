package com.stream.lambda;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecutePrintSomething executePrintSomething = new ExecutePrintSomething();
        processor.process(executePrintSomething);
    }
}
