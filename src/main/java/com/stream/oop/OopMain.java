package com.stream.oop;

public class OopMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecutePrintSomething executePrintSomething = new ExecutePrintSomething();
        processor.process(executePrintSomething);
    }
}
