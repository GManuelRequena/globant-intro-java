package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise6 {
    /*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
     */

    static Scanner keyboard = new Scanner(System.in);

    public static void heights(){
        System.out.print("How many heights would you like to enter: ");
        int amount = keyboard.nextInt();
        int amountLittle = 0;
        double averageHeights = 0,littleHeight = 0;

        for (int i = 0; i < amount; i++){
            System.out.print("Enter a height: ");
            double height = keyboard.nextDouble();
            averageHeights += height;

            if(height < 1.6){
                amountLittle ++;
                littleHeight += height;
            }
        }

        System.out.printf("The average heights is : %.2f", (averageHeights/amount));
        System.out.printf("\nThe average heights under 1.6 is : %.2f", littleHeight/amountLittle);
    }
}
