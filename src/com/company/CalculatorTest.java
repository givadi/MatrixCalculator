package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testCheckIfValidToAdd() {
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2 = new Matrix(2,2);

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals(true, calculator.checkIfValidToAdd());
    }

    @Test
    void testCheckIfValidToMultiply() {
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2 = new Matrix(3,2);

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals(false, calculator.checkIfValidToMultiply());
    }
}