package com.stream.reference;

public class CalculatorExecutor {
    public void executeCalculator(double a, double b, Calculator calculator) {
        double result = calculator.calculate(a, b);
        System.out.println("Result equals: " + result);
    }
}
