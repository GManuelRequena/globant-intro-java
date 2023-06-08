package org.example.firstExercises;

import java.util.Scanner;

public class Exercise5 {
    /*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     */

    Scanner keyboard = new Scanner(System.in);

    public void MathOps(){
        System.out.println("Enter a integer value: ");
        int number = keyboard.nextInt();

        System.out.println("The double is: " + (number*2));
        System.out.println("The triple is: " + (number*3));
        System.out.println("The square root is: " + Math.sqrt(number));
    }
}
