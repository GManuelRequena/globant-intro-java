package org.example;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise17 {
    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    Scanner keyboard = new Scanner(System.in);

    public void countDig(){
        System.out.print("Enter the amount of numbers in the array: ");
        int amount = keyboard.nextInt();
        int oneDig = 0;
        int twoDig = 0;
        int threeDig = 0;
        int fourDig = 0;
        int fiveDig = 0;

        Integer[] vector = new Integer[amount];
        Random rand = new Random();


        for(int i = 0; i < amount; i++){
            vector[i] =rand.nextInt(10100);
        }

        System.out.println(Arrays.toString(vector));

        for (Integer number : vector){
            if(number.toString().length() == 1){
                oneDig++;
                continue;
            }
            if(number.toString().length() == 2){
                twoDig++;
                continue;
            }
            if(number.toString().length() == 3){
                threeDig++;
                continue;
            }
            if(number.toString().length() == 4){
                fourDig++;
                continue;
            }
            if(number.toString().length() == 5){
                fiveDig++;
                continue;
            }
        }

        System.out.println("\nThere are:");
        System.out.println("1 Dig: " + oneDig);
        System.out.println("2 Dig: " + twoDig);
        System.out.println("3 Dig: " + threeDig);
        System.out.println("4 Dig: " + fourDig);
        System.out.println("5 Dig: " + fiveDig);
    }
}
