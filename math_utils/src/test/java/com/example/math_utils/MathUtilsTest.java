package com.example.math_utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    public void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        // Ensure that the expected value comes first, then the actual value, followed by the message.
        Assertions.assertEquals(5, mathUtils.add(2, 3), "Adding 2 and 3 should return 5");
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, mathUtils.subtract(2, 3), "Subtracting 3 from 2 should return -1");
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, mathUtils.multiply(2, 3), "Multiplying 2 and 3 should return 6");
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(-1.0, mathUtils.divide(4, 0), "Dividing by zero should return -1.0");
        // Note: Ensure that your divide method handles division by zero appropriately,
        // perhaps throwing an IllegalArgumentException or returning a predefined constant.
    }
}
