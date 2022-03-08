package com.company;

public class Calculator {
    private Matrix matrix1;
    private Matrix matrix2;

    Calculator(Matrix matrix1, Matrix matrix2)
    {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public boolean checkIfValidToAdd()
    {
        int numRows1 = matrix1.getNumRows();
        int numColumns1 = matrix1.getNumColumns();
        int numRows2 = matrix2.getNumRows();
        int numColumns2 = matrix2.getNumColumns();
        return numRows1 == numRows2 && numColumns1 == numColumns2;
    }
}
