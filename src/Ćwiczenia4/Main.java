package Ćwiczenia4;
import Ćwiczenia4.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{1,2,3});
        Matrix.insertRow(new int[]{4,5,6});
        Matrix.insertRow(new int[]{7,8,9});
        Matrix matrixA = Matrix.create();
        System.out.println("Matrix A:");
        matrixA.print();

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{9,8,7});
        Matrix.insertRow(new int[]{6,5,4});
        Matrix.insertRow(new int[]{3,2,1});
        Matrix matrixB = Matrix.create();
        System.out.println("Matrix B:");
        matrixB.print();


        matrixA.add(matrixB);
        System.out.println("Matrix A after adding B");
        matrixA.print();

        matrixA.subtract(matrixB);
        System.out.println("Matrix A after subtracting B");
        matrixA.print();

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{6,3,2});
        Matrix.insertRow(new int[]{14,5,7});
        Matrix.insertRow(new int[]{27,5,15});
        Matrix matrixC= Matrix.create();

        System.out.println("Matrix (A+B)-C+(A-C)");
                Matrix.add(matrixA,matrixB)
                .subtract(matrixC)
                .add(matrixA.subtract(matrixC)).print();

        Matrix.setUpMatrix(2,3);
        Matrix.insertRow(new int[]{3,6,1});
        Matrix.insertRow(new int[]{1,4,2});
        Matrix matrixD = Matrix.create();
        System.out.println("Matrix D:");
        matrixD.print();

        Matrix.setUpMatrix(3,2);
        Matrix.insertRow(new int[]{1,5});
        Matrix.insertRow(new int[]{2,4});
        Matrix.insertRow(new int[]{1,3});
        Matrix matrixE = Matrix.create();
        System.out.println("Matrix E:");
        matrixE.print();
        System.out.println("Matrix D * Matrix E: ");
        Matrix.multiply(matrixD,matrixE).print();

        ///will throw an exception -->Matrix.multiply(matrixA, matrixD);


    }}
