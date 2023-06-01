package org.example;

import java.util.Scanner;

public class Exercise6 {
    /*
    Crear un programa que dado un numero determine si es par o impar.
     */
    Scanner keyboard = new Scanner(System.in);

    public void IsEven(){
        System.out.println("Enter a integer value: ");
        int number = keyboard.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is not even");
        }
    }
}
