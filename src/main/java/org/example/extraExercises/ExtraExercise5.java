package org.example.extraExercises;

import java.util.Scanner;

public class ExtraExercise5 {
    /*
    Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
     */
    static Scanner keyboard = new Scanner(System.in);

    public static void social(){
        System.out.print("Enter a type of member: ");
        char member = keyboard.next().toLowerCase().charAt(0);

        System.out.print("Enter the cost of the treatment: ");
        double cost = keyboard.nextFloat();

        switch (member){
            case 'a':
                System.out.printf("You have to paid the 50%%, %.2f", (cost/2));
                break;
            case 'b':
                System.out.printf("You have to paid the 65%%, %.2f", (cost*0.65));
                break;
            case 'c':
                System.out.printf("You have to paid the 100%%, %.2f", cost);
                break;
            default:
                System.out.println("NO WEY");
                break;
        }


    }
}
