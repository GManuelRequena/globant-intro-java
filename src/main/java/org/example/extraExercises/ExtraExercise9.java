package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise9 {
    /*
    Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
     */

    public static void division() {
        try(Scanner keyboard = new Scanner(System.in)){
            int res, count = 0;
            System.out.print("Enter a number: ");
            int num1 = keyboard.nextInt();
            System.out.print("Enter a smaller number: ");
            int num2 = keyboard.nextInt();

            do{
                res = num1 -  num2;
                num1 = res;
                count ++;
            }while (res > num2);

            System.out.printf("The residue is %d and quotient is %d", res, count);
        }
    }

}