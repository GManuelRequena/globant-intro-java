package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise11 {
    /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
    de división. Nota: recordar que las variables de tipo entero truncan los números o
    resultados.
     */

    public static void digits(){
        try(Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int number = keyboard.nextInt();

            String num = String.valueOf(number);

            int digs = num.length();

            System.out.printf("The number entered has %d digits", digs);
        }
    }
}
