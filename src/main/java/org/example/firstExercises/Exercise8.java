package org.example.firstExercises;

import java.util.Scanner;

public class Exercise8 {
    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
    Nota: investigar la función Lenght() en Java.
     */

    Scanner keyboard = new Scanner(System.in);

    public void PhraseLenght(){
        System.out.print("Enter a phrase: ");
        String phrase = keyboard.nextLine();

        if(phrase.length() <= 8){
            System.out.println("CORRECT");
        }else {
            System.out.println("INCORRECT");
        }
    }
}
