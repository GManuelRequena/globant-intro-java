package org.example;

import java.util.Scanner;

public class Exercise9 {
    /*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una 'A'. Si la primera letra es una 'A', se deberá de imprimir un mensaje por pantalla que
    diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota: investigar
    la función Substring y equals() de Java.
     */

    Scanner keyboard = new Scanner(System.in);

    public void checkPhrase(){
        System.out.print("Write a phrase or word: ");
        String phrase = keyboard.nextLine();

        if(phrase.substring(0,1).equals("A")){
            System.out.println("CORRECT.");
        }else {
            System.out.println("INCORRECT.");
        }

        /*
        Other way
         */
//        if(phrase.charAt(0) == 'A'){
//            System.out.println("CORRECT.");
//        }else {
//            System.out.println("INCORRECT.");
//        }
    }
}
