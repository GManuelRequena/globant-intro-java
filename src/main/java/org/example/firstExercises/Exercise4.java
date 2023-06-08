package org.example.firstExercises;

import java.util.Scanner;

public class Exercise4 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    Scanner keyboard = new Scanner(System.in);

    public void FromCelsiusToFaren(){
        System.out.println("Enter a temperature in Celsius: ");
        float celsius = keyboard.nextFloat();
        float fahrenheit = 32 + (9 * celsius/5);

        System.out.println("Your temperature in Fahrenheit is: " + fahrenheit);
    }
}
