package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    /*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
     */

    Scanner keyboard = new Scanner(System.in);

    public void Suma() {

        try {
            System.out.println("Ingrese dos numeros enteros: ");
            Integer num1 = keyboard.nextInt();
            Integer num2 = keyboard.nextInt();
            System.out.println("La suma de los dos numeros es: " + (num1 + num2));
        } catch (InputMismatchException e) {
            System.out.println("Uno de los valores es incorrecto.");
        }

    }
}
