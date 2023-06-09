package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise13 {
    /*
    Crear un programa que dibuje una escalera de números, donde cada línea de números
    comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3:
     */

    public static void stair(){
        try(Scanner keyboard = new Scanner(System.in)){
            int steps;
            do {
                System.out.print("Enter the amount of steps: ");
                steps = keyboard.nextInt();

            }while (steps < 0);

            for (int i = 1; i <= steps; i++){
                for(int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
