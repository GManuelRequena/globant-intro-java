package org.example;

import java.util.Scanner;

public class Exercise12 {
    /*

    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
    X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial "&&&&&" marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
    de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().

     */

    Scanner keyboard = new Scanner(System.in);

    public void RS232(){
        int corrects = 0;
        int incorrects = 0;
        String cadena;
        do{
            System.out.println("Ingrese una cadena RS232: ");
            cadena = keyboard.nextLine();
            keyboard.nextLine();


            if(cadena.length() !=5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O'){
                if (cadena.equals("&&&&&")){
                    continue;
                }else{
                    incorrects ++;
                }
            }else {
                if (!cadena.equals("&&&&&")) {
                    corrects++;
                }
            }

        }while(!cadena.equals("&&&&&"));

        System.out.println("La cantidad de lecturas correctas fue de: " + corrects);
        System.out.println("La cantidad de lecturas incorrectas fue de: " + incorrects);
    }
}
