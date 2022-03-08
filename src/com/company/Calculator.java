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
        return matrix1.getNumRows() == matrix2.getNumRows() && matrix1.getNumColumns() == matrix2.getNumColumns();
    }
}
