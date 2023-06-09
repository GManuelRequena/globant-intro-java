package org.example.extraExercises;

public class ExtraExercise12 {
    /*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
     */

    public static void counter(){
        for (int i = 0; i < 1000; i++) {
            String number = String.format("%03d", i); // formato de 3 dígitos con ceros a la izquierda
            String result = number.replace("3", "E"); // reemplaza cada 3 con la letra "E"
            String finalResult = result.substring(0,1)+ "-" + result.substring(1,2) + "-" + result.substring(2,3);
            System.out.println(finalResult);
        }
    }
}
