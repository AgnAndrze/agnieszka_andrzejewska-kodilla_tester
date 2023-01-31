package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double sumResult = calculator.sum(a, b);
        assertEquals(11.4,sumResult, 0.1);
    }
    @Test
        public void testSubstract() {
            Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
            double substractResult = calculator.substract(a, b);
            assertEquals(-0.2, substractResult,0.1);
        }
    @Test
        public void testPower() {
            Calculator calculator = new Calculator();
            double a = 5.6;
            int c = 2;
        double powerResult = calculator.pow(a, c);
        assertEquals(31.36, powerResult, 0.01);
    }
}
