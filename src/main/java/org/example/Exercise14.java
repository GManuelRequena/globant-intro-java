package org.example;

import java.util.Scanner;

public class Exercise14 {
//    Crea una aplicación que a través de una función nos convierta una cantidad de euros
//    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//            (void).
//    El cambio de divisas es:
//            * 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €.

    Scanner keyboard = new Scanner(System.in);
    public void Exercise14(){
        System.out.print("Enter the amount of Euros to convert: ");
        float euros = keyboard.nextFloat();
        System.out.println("Enter the currency to convert:");
        System.out.println("A - USD \nB - Yen \nC - Pounds");
        String opc = keyboard.next();
        moneyConverter(euros, opc);
    }

    public void moneyConverter(float amountEuros, String currency){

        System.out.println("El cambio de divisas es: ");
        switch (currency.substring(0,1)){
            case "a":
            case"A":
                System.out.println(amountEuros * 1.28611 + " USD");
                break;

            case "B":
            case "b":
                System.out.println(amountEuros * 129.852 + " Yen");
                break;

            case "C":
            case "c":
                System.out.println(amountEuros * 0.86 + " Pounds");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + currency.toLowerCase());
        }
    }
}
