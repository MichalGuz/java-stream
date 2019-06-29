package com.stream.reference;

public class ReferenceMain {
    public static void main(String[] args) {
        CalculatorExecutor calculatorExecutor = new CalculatorExecutor();

        System.out.println("Calculating expressions with lambdas:");
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a + b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a - b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a * b);
        calculatorExecutor.executeCalculator(6, 3, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references:");
        calculatorExecutor.executeCalculator(15, 3, FuncionalCalculator :: addAtoB);
        calculatorExecutor.executeCalculator(15, 3, FuncionalCalculator :: subtractBfromA);
        calculatorExecutor.executeCalculator(15, 3, FuncionalCalculator :: multiplyAByB);
        calculatorExecutor.executeCalculator(15, 3, FuncionalCalculator :: divideAByB);
    }
}
