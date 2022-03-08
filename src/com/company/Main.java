package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean stat = true;
        int option;

        while(stat){
            System.out.println("To start enter 1. To exit enter 2");
            option = in.nextInt();
            switch(option){
                case 1:
                    stat = createProblem(option);
                    break;
                case 2:
                default:
                    stat = false;
                    break;
            }
        }
        System.out.println("Calculator now terminated");
    }

    public static boolean createProblem(int i){
        Scanner in = new Scanner(System.in);
        boolean condition;

        int contStat;
        boolean statusC;

        int frows;
        int fcolumns;
        int srows;
        int scolumns;

        Matrix matrix1;
        Matrix matrix2;

        System.out.println("Enter number of rows in first matrix");
        frows = in.nextInt();
        String operator;
        System.out.println("Enter number of columns in first matrix");
        fcolumns = in.nextInt();
        System.out.println("Enter number of rows in second matrix");
        srows = in.nextInt();
        System.out.println("Enter number of columns in second matrix");
        scolumns = in.nextInt();

        matrix1 = new Matrix(frows, fcolumns);
        matrix1.setLabel("First");

        matrix2 = new Matrix(srows, scolumns);
        matrix2.setLabel("Second");

        matrix1.setMatrixValues();
        matrix2.setMatrixValues();

        statusC = true;
        while(statusC){
            System.out.println("Select matrix operation, \n type in + for addition, - for subtraction or * for multiplication:");
            operator = in.next();
            statusC = performOperation(operator, matrix1, matrix2);
        }

        System.out.println("Type 1 if you would like to continue using the calcultor,\n type 2 if you would like to exit");
        contStat = in.nextInt();
        switch(contStat){
            case 1:
                condition = true;
                break;
            case 2:
            default:
                condition = false;
                break;
        }
        return condition;
    }

    public static boolean performOperation(String operator, Matrix matrix1, Matrix matrix2){
        Scanner in = new Scanner(System.in);

        Calculator calculator = new Calculator(matrix1, matrix2);

        int optSelected;
        boolean status = false;
        switch(operator){
            case "*":
                if (!calculator.multiplyMatrices().equals("")) {
                    System.out.println(calculator.multiplyMatrices());
                } else {
                    System.out.println("Invalid matrices");
                }
                break;
            case "+":
                if (!calculator.addMatrices().equals("")) {
                    System.out.println(calculator.addMatrices());
                } else {
                    System.out.println("Invalid matrices");
                }
                break;
            case "-":
                if (!calculator.subtractMatrices().equals("")) {
                    System.out.println(calculator.subtractMatrices());
                } else {
                    System.out.println("Invalid matrices");
                }
                break;
            default:
                System.out.println("Operator not valid");
                break;
        }

        System.out.println("If you would like to perform additional operations on the two matrices used"+
                " Type 1,\n or if you what to use a different pair of matrices to perform operations with type 2\n"+
                "To exit type 3");
        optSelected = in.nextInt();
        switch(optSelected){
            case 1:
                status = true;
                break;
            case 2:
            case 3:
            default:
                status = false;
                break;
        }
        return status;
    }
}
