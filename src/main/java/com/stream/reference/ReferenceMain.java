package com.stream.reference;

public class ReferenceMain {
    public static void main(String[] args) {
        CalculatorExecutor calculatorExecutor = new CalculatorExecutor();

        System.out.println("Calculating expressions with lambdas:");
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a + b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a - b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a * b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a / b);


    }
}
