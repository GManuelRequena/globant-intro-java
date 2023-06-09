package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise2 {
    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    Scanner keyboard = new Scanner(System.in);


    public void switchValues(){
        System.out.println("Enter values for: ");
        System.out.print("A: ");
        int a = keyboard.nextInt();
        System.out.print("B: ");
        int b = keyboard.nextInt();
        System.out.print("C: ");
        int c = keyboard.nextInt();
        System.out.print("D: ");
        int d = keyboard.nextInt();

        System.out.printf("Los valores iniciales son: %d, %d, %d, %d",a,b,c,d);

        int aux;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.printf("\nLos nuevos valores son: %d, %d, %d, %d",a,b,c,d);

    }
}
