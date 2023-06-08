package org.example.firstExercises;

import java.util.Scanner;

public class Exercise13 {
    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter "*". Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *

     */

    Scanner keyboard = new Scanner(System.in);

    public void DibujarCuadrado(){
        System.out.print("Ingrese cantidad de *: ");
        int cant = keyboard.nextInt();

        for(int i = 0; i < cant; i++){
            for(int j = 0; j < cant; j++){
                if(i == 0 || i == cant-1 || j == 0 || j == cant-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }
}
