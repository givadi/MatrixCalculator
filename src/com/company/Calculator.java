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

    public boolean checkIfValidToMultiply()
    {
        return matrix1.getNumColumns() == matrix2.getNumRows();
    }

    public String addMatrices()
    {
        String result = "";
        if (checkIfValidToAdd()) {
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix1.getNumColumns(); j++) {
                    int charM1 = matrix1.getElementValue(i, j);
                    int charM2 = matrix2.getElementValue(i, j);
                    int resultant = charM1 + charM2;
                    result += resultant + " ";
                }
                result += "\n";
            }
        }
        return result;
    }

    public String subtractMatrices()
    {
        String result = "";
        if (checkIfValidToAdd()) {
            for(int i = 0; i < matrix1.getNumRows(); i++){
                for(int j = 0; j < matrix1.getNumColumns(); j++){
                    int charM1 = matrix1.getElementValue(i, j);
                    int charM2 = matrix2.getElementValue(i, j);
                    int resultant = charM1 - charM2;
                    result += resultant + " ";
                }
                result += "\n";
            }
        }
        return result;
    }

    public String multiplyMatrices()
    {
        String result = "";
        if (checkIfValidToMultiply()) {
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix2.getNumColumns(); j++) {
                    int fnum = matrix1.getElementValue(i, j);
                    int snum = matrix2.getElementValue(i, j);
                    int resultant = fnum * snum;
                    result += resultant + " ";
                }
                result += "\n";
            }
        }
        return result;
    }
}
