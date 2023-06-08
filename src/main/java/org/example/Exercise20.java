package org.example;

import java.util.Scanner;

public class Exercise20 {
    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
     */
    Scanner keyboard = new Scanner(System.in);
    public void magicSquare(){
        Integer[][] matrix = new Integer[3][3];
        int value;
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++){

                do {
                    System.out.print("Enter a value for row "+i+" col "+j+": ");
                    value = keyboard.nextInt();
                }while(value < 1 || value > 9);
                matrix[i][j] = value;
            }
        }


        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        int sumRow = matrix[0][0] + matrix[0][1] + matrix[0][2];
        for(int i = 0; i < 3; i++) {
            int sumCol = matrix[0][i] + matrix[1][i] + matrix[2][i];

            if (sumRow != sumCol) {
                System.out.println("Not a magic cube");
                return;
            }


            int sumDiag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            int sumDiag2 = matrix[0][2] + matrix[1][1] + matrix[2][0];

            if (sumDiag1 != sumDiag2) {
                System.out.println("Not a magic cube.");
                return;
            }
        }
        System.out.println("It's a magic cube");
    }
}
