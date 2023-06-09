package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise4 {
    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
     */

    static Scanner keyboard = new Scanner(System.in);
    public static void toRoman(){
        System.out.print("Enter a number between 1 and 10: ");
        int number = keyboard.nextInt();

        if(number < 1 || number > 10){
            System.out.println("The number entered is not in the range.");
            return;
        }

        switch (number){
            case 1:
                System.out.println("It's equal to: I");
                break;
            case 2:
                System.out.println("It's equal to: II");
                break;
            case 3:
                System.out.println("It's equal to: III");
                break;
            case 4:
                System.out.println("It's equal to: IV");
                break;
            case 5:
                System.out.println("It's equal to: V");
                break;
            case 6:
                System.out.println("It's equal to: VI");
                break;
            case 7:
                System.out.println("It's equal to: VII");
                break;
            case 8:
                System.out.println("It's equal to: VIII");
                break;
            case 9:
                System.out.println("It's equal to: IX");
                break;
            case 10:
                System.out.println("It's equal to: X");
                break;
        }


    }
}
