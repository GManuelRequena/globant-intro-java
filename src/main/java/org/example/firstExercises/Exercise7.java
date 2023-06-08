package org.example.firstExercises;

import java.util.Scanner;

public class Exercise7 {
    /*
    Crear un programa que pida una frase y si esa frase es igual a "eureka" el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
     */

    Scanner keyboard = new Scanner(System.in);

    public void Eureka(){
        System.out.print("Enter a word: ");
        String word = keyboard.nextLine();

        if(word.equals("eureka")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
