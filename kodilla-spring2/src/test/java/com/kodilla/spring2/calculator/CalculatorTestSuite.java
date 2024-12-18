package com.kodilla.spring2.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        double result = calculator.add(1.11, 2.55);
        assertEquals(3.66, result);
    }
    @Test
    public void testSubtract() {
        double result = calculator.subtract(1.234, 2.645);
        assertEquals(-1.411, result);

    }
    @Test
    public void testMultiply() {
        double result = calculator.multiply(1.234, 2.567);
        assertEquals(3.167678, result);
    }
    @Test
    public void testDivide() {
        double result = calculator.divide(1.8, 1.5);
        assertEquals(1.2, result);
    }
}
