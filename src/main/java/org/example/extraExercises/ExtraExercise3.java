package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise3 {
    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    Scanner keyboard = new Scanner(System.in);

    public void isVowel(){
        System.out.print("Enter a letter: ");
        String letter = keyboard.next();

        if(letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")
        ){
            System.out.printf("The letter %s is a vowel", letter);
        }else {
            System.out.printf("The letter %s is not a vowel", letter);
        }
    }
}
