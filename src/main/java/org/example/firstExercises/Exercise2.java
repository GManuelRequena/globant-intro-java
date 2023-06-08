package org.example.firstExercises;

import java.util.Scanner;

public class Exercise2 {
    /*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.
     */

    Scanner keyboard = new Scanner(System.in);

    public void Name(){
        System.out.println("What's your name?: ");
        String name = keyboard.nextLine();

        System.out.println("Your name is " + name);
    }
}
