package com.fibonacci_recursion;

public class FibRecursion {
    public static int fibonacciFoundNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciFoundNumber(n - 1) + fibonacciFoundNumber(n - 2);
        }
    }
}