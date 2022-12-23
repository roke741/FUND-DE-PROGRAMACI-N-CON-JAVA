
package com.mycompany.ejercicios.ejercicio01;

/**
 *
 * @author Jhordie
 */
public class Ejercicio01_S3 {
         public static void main(String args[]){
        
        String[] names = new String[3]; //apunta a null
        
        //String names[] = new String[3]; //crea 3 espacios de memoria vacios 
                                          //luego apunta anull
        
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";
        
        int[] numbers = {100, 200, 300};
        
        for (String name:names){
           System.out.println("Name: " + name); 
        }
        
        for (int number:numbers){
           System.out.println("Number: " + number); 
        }           
    }
}
