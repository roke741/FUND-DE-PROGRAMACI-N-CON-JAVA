
package com.mycompany.ejercicio01;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jhordie
 */
public class Prueba04 {
        //TODO hacer un programa para abrir n = 3 calculadoras.
        public static void main(String[] args) {
        System.out.println("ingresa un numero entero");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        //for(;;){
        for(int i=1; i<=n ; i++){
            try {
                Runtime.getRuntime().exec("calc");
            } catch (IOException ex) {
                System.out.println("error");
            }
        }
    }
}