package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise8 {
    /*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */

    //static Scanner keyboard = new Scanner(System.in);

    public static void readadNumbers(){

        try(Scanner keyboard = new Scanner(System.in)) {
            int number, count = 0, even = 0, odd = 0;
            boolean next = true;

            while (next) {
                System.out.print("Enter a number: ");
                number = keyboard.nextInt();

                if (number == 0) {
                    continue;
                }

                if (number % 5 == 0) {
                    next = false;
                } else {
                    count++;
                    if (number % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
            }
            System.out.println("You entered: ");
            System.out.printf("%d numbers", count);
            System.out.printf("\n%d even numbers", even);
            System.out.printf("\n%d odd numbers", odd);
        }
    }
}
