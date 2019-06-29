package com.stream.calculator;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression){
        double result = mathExpression.calculate(a, b);
        System.out.println("Result equals: " + result);
    }
}
