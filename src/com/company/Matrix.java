package com.company;

public class Matrix {
    private int numRows, numColumns;
    private int[][] matrix;

    private String label;

    Matrix(int numRows, int numColumns)
    {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.matrix = this.createMatrix();
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumRows()
    {
        return this.numRows;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public int getNumColumns()
    {
        return this.numColumns;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getLabel()
    {
        return label;
    }

    private int[][] createMatrix()
    {
        int[][] matrix = new int[this.numRows][this.numColumns];
        return matrix;
    }
}
