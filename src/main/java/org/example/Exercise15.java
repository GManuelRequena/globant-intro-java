package org.example;

public class Exercise15 {
    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
     */

    public void rellenarYMostrarVec(){
        int[] numbers = new int[100];

        for(int i = 0; i < 100; i++){
            numbers[i] = i+1;
        }

        int j = 99;
        while (j > 0) {
            System.out.print(" - " + numbers[j]);
            j--;
        }
    }
}
