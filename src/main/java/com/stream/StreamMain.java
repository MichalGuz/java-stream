package com.stream;

import com.stream.lambda.ExecutePrintSomething;
import com.stream.lambda.Processor;


public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecutePrintSomething executePrintSomething = new ExecutePrintSomething();
        processor.process(executePrintSomething);
    }
}
