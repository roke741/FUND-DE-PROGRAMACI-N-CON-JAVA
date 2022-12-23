
package com.mycompany.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Jhordie
 */
public class Prueba03 {
    //TODO  hacer n programa que muestre el sueldo de un profesor sabiendo que:
    //categoria A: 2500.00
    //categoria B: 2000.00
    //categoria C: 1500.00
     public static void main(String[] args) {
        System.out.println("ingresa la categoria");
        Scanner sc = new Scanner (System.in);
        char n = sc.next().charAt(0);//captura el primer caracter  un numero entero y lo asigna a n
        double sueldo;
        System.out.println("categoria elegida: "+n);
         switch (n) {
             case 'A':
                 sueldo=2500;
                 break;
             case 'B':
                 sueldo=2000;
                 break;
             case 'C':
                 sueldo=1500;
                 break;
             default:
                 sueldo = 0;
         }
    
         System.out.println("el sueldo es: "+sueldo);
    }
}