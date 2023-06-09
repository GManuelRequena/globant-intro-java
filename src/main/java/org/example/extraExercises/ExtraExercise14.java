package org.example.extraExercises;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ExtraExercise14 {
    /*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
     */

    public static void averageAge(){
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.print("Enter the amount of families: ");
            int families = keyboard.nextInt();

            double[] avgChildAge = new double[families];

            for(int i = 0; i < families; i++){
                System.out.print("Enter the amount of children for family " + i);
                double children = keyboard.nextDouble();
                for(int j = 0; j < children; j++){
                    System.out.print("Age of children " + j + " :");
                    avgChildAge[i] += keyboard.nextInt();
                }
                avgChildAge[i] = avgChildAge[i]/children;
            }

            System.out.println("Average age of each family: " + Arrays.toString(avgChildAge));
            double avgAllFamilies;
            avgAllFamilies = Arrays.stream(avgChildAge).average().getAsDouble();
            System.out.printf("Average age of all families: %.2f", avgAllFamilies);
        }
    }
}
