package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise10 {
    /*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
     */

    public static void guess(){
        boolean guess = false;
        int numberToGuess = (int) (((Math.random() * Math.random()))*100), numberGuessed;
        System.out.println(numberToGuess);
        try(Scanner keyboard = new Scanner(System.in)){
            while (!guess){
                System.out.print("Enter the number you think it is: ");
                numberGuessed = keyboard.nextInt();
                if (numberGuessed == numberToGuess){
                    guess = true;
                    System.out.println("You win!");
                }else {
                    System.out.println("Wrong!");
                }
            }
        }
    }
}
