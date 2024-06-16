package com.calculator;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }
        return Math.sqrt(a);
    }

    public long factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot compute the factorial of a negative number.");
        }
        return CombinatoricsUtils.factorial(a);
    }
}