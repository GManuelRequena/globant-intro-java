package org.example.firstExercises;

import java.util.Scanner;

public class Exercise19 {
    /*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    Scanner keyboard = new Scanner(System.in);


    public void antiSymmetric(){

        System.out.print("Enter the size of the matrix: ");
        int size = keyboard.nextInt();
        int[][] matrix = new int[size][size];
        int[][] matrixT = new int[size][size];

        for(int i=0; i < size; i++){
            for (int j=0; j < size; j++){
                System.out.print("Enter a value for row"+i+" col"+j+" :");
                matrix[i][j] = keyboard.nextInt();
                matrixT[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }

        boolean antiSim = false;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(matrix[i][j] == (matrixT[i][j] * (-1))){
                    antiSim = true;
                }else {
                    antiSim = false;
                    break;
                }
            }
        }

        if (antiSim) {
            System.out.println("The matrix is anti symmetric");
        } else {
            System.out.println("The matrix is not anti symmetric");
        }

    }
}
