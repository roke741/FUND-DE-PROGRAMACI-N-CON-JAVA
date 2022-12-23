
package com.mycompany.ejercicio_s08.pruebas;

import com.mycompany.ejercicio_s08.entidades.Persona;
import com.mycompany.ejercicio_s08.entidades.Profesor;

/**
 *
 * @author Jhordie
 */
public class Prueba03 {
    public static void main(String[] args) {
        //TODO crear y mostrar datos de un profesor
        Persona profesor = new Profesor("A", 1200, 10, "Pedro", true);
        System.out.println(profesor);
    }
}
