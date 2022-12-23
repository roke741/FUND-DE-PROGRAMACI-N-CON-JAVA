
package com.mycompany.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Jhordie
 */
public class Prueba02 {
        //TODO Hacer un programa que muestre si un numero entero ingresado 
        //es positivo, negativo o CERO.

         public static void main(String[] args) {
            System.out.println("ingresa un numero entero");
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();//captura un numero entero y lo asigna a n

            if(n<0)
                 System.out.println("es negativo");
            else if (n>0)
                 System.out.println("es positivo");
            else
                 System.out.println("es CERO");
                 
        }

    }