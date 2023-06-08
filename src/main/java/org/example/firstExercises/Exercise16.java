package org.example.firstExercises;

import java.util.Scanner;

public class Exercise16 {
    /*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
     */

    Scanner keyboard = new Scanner(System.in);
    public void fillVectorRandom(){

        System.out.print("Enter size of the vector: ");
        int size = keyboard.nextInt();
        int[] vector = new int[size];

        for(int i = 0; i < size; i++){
            vector[i] =(int) (Math.random()*100);
        }

        for(int number : vector){
            System.out.print(" " + number);
        }

        System.out.print("\nEnter a number to search: ");
        int search = keyboard.nextInt();

        int pos = 0, rep = 0;
        for (int i = 0; i <size; i++){
            if(vector[i] == search && rep == 0){
                pos = i;
                rep ++;
            }else if (vector[i] == search && rep != 0){
                rep ++;
            }
        }

        System.out.print("The number: " + search + " is in position: " + pos + " and it's " + rep + " times.");
    }
}
