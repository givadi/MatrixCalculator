package com.company;

import java.util.Scanner;

public class Matrix {
    private Scanner in = new Scanner(System.in);

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

    public void setMatrixValues()
    {
        for(int i=0; i<this.numRows; i++){
            for(int j=0; j < this.numColumns; j++){
                System.out.println("Enter value of " + this.label + " matrix at row: " + i + " and column:" + j + "");
                setElementValue(i,j,in.nextInt());
            }
        }
    }

    public void setElementValue(int i, int j, int num)
    {
        this.matrix[i][j] = num;
    }

    public int getElementValue(int i, int j)
    {
        return this.matrix[i][j];
    }

    private int[][] createMatrix()
    {
        int[][] matrix = new int[this.numRows][this.numColumns];
        return matrix;
    }
}
