package org.example.extraExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraExercise7 {
    /*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle 'while' y otra con el bucle 'do - while'.
     */

    static Scanner keyboard = new Scanner(System.in);

    public static void average(){
        System.out.print("Enter the amount of numbers to be entered: ");
        int amount = keyboard.nextInt();

        int[] numbers = new int[amount];
        int i = 0;

        while (amount > 0){
            System.out.print("Enter a value: ");
            numbers[i] = keyboard.nextInt();
            i ++;
            amount --;
        }

//        int min = Arrays.stream(numbers).min().getAsInt();
//        int max = Arrays.stream(numbers).max().getAsInt();
//        double avg = Arrays.stream(numbers).average().getAsDouble();

//        System.out.printf("The min value is: %d", min);
//        System.out.printf("\nThe max value is: %d", max);
//        System.out.printf("\nThe average value is: %.2f", avg);

        int max = numbers[0];
        int min = numbers[0];
        double avg = 0;
//        for (int number : numbers) {
//
//            avg += number;
//
//            if (number > max) {
//                max = number;
//            }
//
//            if (number < min) {
//                min = number;
//            }
//        }

//        int count = numbers.length;
//        int iter = 0;
//        while(count > 0){
//
//            avg += numbers[iter];
//
//            if (numbers[iter] > max) {
//                max = numbers[iter];
//            }
//
//            if (numbers[iter] < min) {
//                min = numbers[iter];
//            }
//            count --;
//            iter ++;
//        }

        int count = numbers.length;
        int iter = 0;
        do{

            avg += numbers[iter];

            if (numbers[iter] > max) {
                max = numbers[iter];
            }

            if (numbers[iter] < min) {
                min = numbers[iter];
            }
            count --;
            iter ++;
        }while(count > 0);

        System.out.printf("The min value is: %d", min);
        System.out.printf("\nThe max value is: %d", max);
        System.out.printf("\nThe average value is: %.2f", avg/numbers.length);
        //System.out.println(Arrays.toString(numbers));
    }
}
