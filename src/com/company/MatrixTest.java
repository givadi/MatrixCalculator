package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void testGetNumRows() {
        Matrix matrix = new Matrix(2,2);
        assertEquals(2, matrix.getNumRows());
    }

    @Test
    void testGetNumColumns() {
        Matrix matrix = new Matrix(2,3);
        assertEquals(3, matrix.getNumColumns());
    }

    @Test
    void testGetLabel() {
        Matrix matrix = new Matrix(2,3);
        matrix.setLabel("First");
        assertEquals("First", matrix.getLabel());
    }
}