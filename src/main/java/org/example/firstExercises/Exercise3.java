package org.example.firstExercises;

import java.util.Scanner;

public class Exercise3 {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */

    Scanner keyboard = new Scanner(System.in);

    public void ChangeUpperLowerCase(){
        System.out.println("Write a sentence: ");
        String sentence = keyboard.nextLine();

        System.out.println("The sentence in UpperCase is: " + sentence.toUpperCase());
        System.out.println("The sentence in LowerCase is: " + sentence.toLowerCase());
    }
}
