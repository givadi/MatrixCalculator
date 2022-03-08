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

    @Test
    void testAddMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(2,2);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("4 4 \n4 4 \n", calculator.addMatrices());
    }

    @Test
    void testAddMatricesWithWrongMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(3,3);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("", calculator.addMatrices());
    }

    @Test
    void testSubtractMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(2,2);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("0 0 \n0 0 \n", calculator.subtractMatrices());
    }

    @Test
    void testSubtractMatricesWithWrongMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(3,3);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("", calculator.subtractMatrices());
    }

    @Test
    void testMultiplyMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(2,2);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("4 4 \n4 4 \n", calculator.multiplyMatrices());
    }

    @Test
    void testMultiplyMatricesWithWrongMatrices() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMatrixValues();
        Matrix matrix2 = new Matrix(3,3);
        matrix2.setMatrixValues();

        Calculator calculator = new Calculator(matrix1, matrix2);
        assertEquals("", calculator.multiplyMatrices());
    }
}