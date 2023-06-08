package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise1 {
    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    Scanner keyboard = new Scanner(System.in);

    public void convertToDays(){
        System.out.print("Enter a time in minutes: ");
        int minutes = keyboard.nextInt();

        int hours = minutes/60;
        int days = 0;

        do{
            if(hours > 24){
                days += 1;
                hours = hours % 24;
            }
        } while (hours % 24 != 0 && hours > 24);

        System.out.print(minutes + " mins are equal to "+days+" days and "+hours+" hours");
    }
}
