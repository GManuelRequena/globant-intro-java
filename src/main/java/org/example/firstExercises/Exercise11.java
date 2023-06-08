package org.example.firstExercises;

import java.util.Scanner;

public class Exercise11 {
    /*

    Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:

    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:

    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
    y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
    directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
    desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
    programa, caso contrario se vuelve a mostrar el menú.
     */

    Scanner keyboard = new Scanner(System.in);

    public void Menu(){
        System.out.println("Ingrese dos numeros enteros positivos: ");
        float num1 = keyboard.nextFloat();
        keyboard.nextLine(); // I did this because in the line 31 after you hit enter, there is a '\n' character buffered for next line. I "flushed" it
        float num2 = keyboard.nextFloat();
        keyboard.nextLine();

        String option = "n";
        do{
            System.out.println("*****     MENU     *****");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("*****              *****");
            int opc = keyboard.nextInt();
            keyboard.nextLine();

            if(opc == 1){
                System.out.println("La suma es: " + (num1+num2));
            }
            if(opc == 2){
                System.out.println("La resta es: " + (num1-num2));
            }
            if(opc == 3){
                System.out.println("La multi es: " + (num1*num2));
            }
            if(opc == 4){
                System.out.println("La divison es: " + (num1/num2));
            }
            if(opc == 5){
                System.out.println("Do you really want to exit?");
                option = keyboard.nextLine();
            }

        }while(!option.equalsIgnoreCase("y"));


    }
}
