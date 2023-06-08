package org.example.firstExercises;

import java.util.Scanner;

public class Exercise10 {
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    Scanner keyboard = new Scanner(System.in);
    public void SumaLimite(){
        Integer numero = 0;
        Integer limite = 0;
        Integer suma = 0;

        System.out.print("Ingrese un limite positivo: ");
        limite = keyboard.nextInt();

        while(suma <= limite){
            System.out.println("Ingrese un numero: ");
            suma += keyboard.nextInt();
        }
    }
}
