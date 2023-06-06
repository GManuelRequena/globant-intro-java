package org.example;

import java.util.Random;

public class Exercise18 {
    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
     */

    public void transpose(){
        Integer[][] matrix = new Integer[4][4];
        Integer[][] matrixT = new Integer[4][4];

        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = rand.nextInt(10);
                matrixT[i][j] = 0;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++){
            for(int j =0; j < 4; j++){
                matrixT[j][i] = matrix[i][j];
            }
        }

        System.out.println(" ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
    }
}
