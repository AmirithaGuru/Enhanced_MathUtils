package com.example.math_utils;

public class MathUtils {
    
    /**
     * Adds two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     * @param a the integer from which to subtract
     * @param b the integer to subtract
     * @return the result of subtracting b from a
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing a by b, or -1.0 if division by zero occurs
     */
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handle division by zero with a special return value
        }
        return (double) a / b;
    }
}
